public class WordCount {
    public static void count(Map map, String[] words) {
        int count = 0;
        Iterator vitr = map.values();
        while (vitr.hasNext()) {
            String word = vitr.next();
            for (int i=0; i<words.length; i++) {
                if (words[i].equals(word)) {
                    count += 1;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Map<String, String> map = new ArrayMap<String, String>();

    }

}
