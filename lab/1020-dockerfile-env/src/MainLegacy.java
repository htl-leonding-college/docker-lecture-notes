void main(String[] args) {
    // Direkter Zugriff auf die Docker-Umgebungsvariable
    String colorEnv = System.getenv("APP_COLOR");

    String colorCode;
    if (colorEnv == null) {
        colorCode = "\u001B[0m"; // Reset
    } else {
        switch (colorEnv.toUpperCase()) {
            case "RED":
                colorCode = "\u001B[41m";
                break;
            case "GREEN":
                colorCode = "\u001B[42m";
                break;
            case "YELLOW":
                colorCode = "\u001B[43m";
                break;
            case "BLUE":
                colorCode = "\u001B[44m";
                break;
            default:
                colorCode = "\u001B[0m";
        }
    }

    IO.println(colorCode + "                                         " + "\u001B[0m");
    IO.println(colorCode + "    HALLO AUS DER JAVA-DOCKER-WELT!      " + "\u001B[0m");
    IO.println(colorCode + "    Farbe aus ENV: " + (colorEnv != null ? colorEnv : "Standard") + " ".repeat(22-colorEnv.length()) + "\u001B[0m");
    IO.println(colorCode + "                                         " + "\u001B[0m");
    
}