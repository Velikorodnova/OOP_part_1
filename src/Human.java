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
        if (town == null || town == "") {
            this.town = "(Информация не указана)";
        } else {
            this.town = town;
        }
        if (job == null || job == "") {
            this.job = "(Информация не указана)";
        } else {
            this.job = job;
        }


    }

    public String toString() {
        return "Привет! Меня зовут " + name + ". Я из города " + town + "."
                + " Я родился(ась) в " + dateOfBirth + " году. Я работаю на должности " + job + ". Будем знакомы!";
    }
}
