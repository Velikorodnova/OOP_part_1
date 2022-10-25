public class Human {
    private int dateOfBirth;
    private String name;
    private String town;
    private String job;

    Human(int dateOfBirth, String name, String town, String job) {
        this.dateOfBirth = dateOfBirth;
        this.name = name;
        this.town = town;
        this.job = job;

        if (town == null || town.isEmpty()) {
            this.town = "(Информация не указана)";
        } else {
            this.town = town;
        }
        if (dateOfBirth >= 0) {
            this.dateOfBirth = dateOfBirth;
        } else {
            this.dateOfBirth = Math.abs(dateOfBirth);
        }
        if (name == null || name == "") {
            this.name = "(Информация не указана)";
        } else {
            this.name = name;
        }

        if (job == null || job == "") {
            this.job = "(Информация не указана)";
        } else {
            this.job = job;
        }
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        if (dateOfBirth != 0) {
            this.dateOfBirth = dateOfBirth;
        } else {
            this.dateOfBirth = Integer.parseInt("Информация не указана");
        }

    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        if (town != null || !town.isEmpty()) {
            this.town = town;
        } else {
            this.town = "Информация не указана";
        }
    }

    public String toString() {
        return "Привет! Меня зовут " + name + ". Я из города " + town + "."
                + " Я родился(ась) в " + dateOfBirth + " году. Я работаю на должности " + job + ". Будем знакомы!";
    }
}
