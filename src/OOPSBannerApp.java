public class OOPSBannerApp {

    // Static inner class to store character pattern
    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        CharacterPatternMap o = new CharacterPatternMap('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        CharacterPatternMap p = new CharacterPatternMap('P', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        });

        CharacterPatternMap s = new CharacterPatternMap('S', new String[]{
                " ***** ",
                "*     *",
                "*      ",
                " ***** ",
                "      *",
                "*     *",
                " ***** "
        });

        String word = "OOPS";

        for (int i = 0; i < 7; i++) {
            StringBuilder line = new StringBuilder();

            for (char c : word.toCharArray()) {
                if (c == 'O') {
                    line.append(o.getPattern()[i]).append("   ");
                } else if (c == 'P') {
                    line.append(p.getPattern()[i]).append("   ");
                } else if (c == 'S') {
                    line.append(s.getPattern()[i]).append("   ");
                }
            }

            System.out.println(line.toString());
        }
    }
}

