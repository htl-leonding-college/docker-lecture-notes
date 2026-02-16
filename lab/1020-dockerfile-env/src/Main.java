void main() {
    // Holen der Variable (Optional zur Sicherheit, falls null)
    String colorEnv = System.getenv("APP_COLOR");

    // Der Switch als Expression: Kompakt, sicher und liest sich fast wie Prosa
    String colorCode = switch (colorEnv) {
        case null -> "\u001B[0m";
        case String s when s.equalsIgnoreCase("RED")    -> "\u001B[41m";
        case String s when s.equalsIgnoreCase("GREEN")  -> "\u001B[42m";
        case String s when s.equalsIgnoreCase("YELLOW") -> "\u001B[43m";
        case String s when s.equalsIgnoreCase("BLUE")   -> "\u001B[44m";
        default -> "\u001B[0m";
    };

    String displayEnv = (colorEnv == null) ? "Standard" : colorEnv;

    IO.println("""
        %s                                         \u001B[0m
        %s    HALLO AUS DER JAVA-DOCKER-WELT!      \u001B[0m
        %s    Farbe aus ENV: %-20s  \u001B[0m
        %s                                         \u001B[0m
        """.formatted(colorCode, colorCode, colorCode, displayEnv, colorCode));
}