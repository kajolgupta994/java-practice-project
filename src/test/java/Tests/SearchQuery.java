package Tests;

import java.io.*;
import java.util.*;

class SearchQuery {
	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}

		Integer nextInt() {
			return Integer.parseInt(next());
		}
	}

	public static void main(String[] args) throws IOException {
		FastReader sc = new FastReader();
		PrintWriter out = new PrintWriter(System.out);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			String sentences[] = new String[n];
			int times[] = new int[n];
			for (int i = 0; i < n; i++) {
				sentences[i] = sc.nextLine();
				times[i] = sc.nextInt();
			}
			AutoCompleteSystem obj = new AutoCompleteSystem(sentences, times);
			int q = sc.nextInt();
			for (int i = 0; i < q; i++) {
				String query = sc.nextLine();
				StringBuilder qq = new StringBuilder();
				for (int j = 0; j < query.length(); j++) {
					char x = query.charAt(j);
					qq.append(String.valueOf(x));
					ArrayList<String> suggestions = obj.input(x);
					if (x == '#')
						continue;
					out.print("Typed : \"" + qq.toString() + "\" , Suggestions: \n");
					for (String y : suggestions)
						out.print(y + "\n");
				}
			}
		}
		out.flush();
	}
}

class AutoCompleteSystem {
	// Trie Node definition
	static class TrieNode {
		Map<String, Integer> sentenceFrequency; // Sentence to frequency mapping
		Map<Character, TrieNode> children; // Links to child nodes

		TrieNode() {
			sentenceFrequency = new HashMap<>();
			children = new HashMap<>();
		}
	}

	private TrieNode root; // Root of the Trie
	private StringBuilder currentInput; // Tracks the current prefix being typed
	private TrieNode currentNode; // Tracks the current node during input

	public AutoCompleteSystem(String[] sentences, int[] times) {
		root = new TrieNode();
		currentInput = new StringBuilder();
		currentNode = root;

		// Add all given sentences and their frequencies to the Trie
		for (int i = 0; i < sentences.length; i++) {
			addSentence(sentences[i], times[i]);
		}
	}

	// Add a sentence to the Trie with its frequency
	private void addSentence(String sentence, int frequency) {
		TrieNode node = root;

		for (char ch : sentence.toCharArray()) {
			node.children.putIfAbsent(ch, new TrieNode());
			node = node.children.get(ch);
			node.sentenceFrequency.put(sentence, node.sentenceFrequency.getOrDefault(sentence, 0) + frequency);
		}
	}

	public ArrayList<String> input(char c) {
		if (c == '#') {
			// End of input, add the current sentence to the Trie
			addSentence(currentInput.toString(), 1);
			currentInput = new StringBuilder(); // Reset for the next input
			currentNode = root;
			return new ArrayList<>();
		}

		currentInput.append(c);
		if (currentNode != null && currentNode.children.containsKey(c)) {
			currentNode = currentNode.children.get(c);
			// Get top 3 sentences from current node's sentenceFrequency map
			return getTop3Sentences(currentNode.sentenceFrequency);
		} else {
			currentNode = null; // No matching sentences for the current prefix
			return new ArrayList<>();
		}
	}

	// Get top 3 sentences based on frequency and lexicographical order
	private ArrayList<String> getTop3Sentences(Map<String, Integer> sentenceFrequency) {
		PriorityQueue<String> maxHeap = new PriorityQueue<>((a, b) -> {
			int freqCompare = sentenceFrequency.get(b) - sentenceFrequency.get(a);
			if (freqCompare == 0) {
				return a.compareTo(b);
			}
			return freqCompare;
		});

		maxHeap.addAll(sentenceFrequency.keySet());
		ArrayList<String> top3 = new ArrayList<>();
		for (int i = 0; i < 3 && !maxHeap.isEmpty(); i++) {
			top3.add(maxHeap.poll());
		}

		return top3;
	}
}
