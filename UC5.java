public class UC5{

    public static void main(String[] args) {

        String nameText;

        if (args.length == 0) {
            nameText = "World";
        }
        else {

            StringBuilder nameBuilder = new StringBuilder();
            boolean first = true;

            for (String name : args) {

                if (!first) {
                    nameBuilder.append(", ");
                }
                nameBuilder.append(name);
                first = false;
            }
            nameText = nameBuilder.toString();
        }
        System.out.println("Hello, " + nameText + "!");
    }
}