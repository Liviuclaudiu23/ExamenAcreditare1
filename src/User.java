public class User {
    private String username;
    private String password;
    private double weight;
    private double height;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.weight = 0;
        this.height = 0;
    }

    public String getUsername() {
        return this.username;
    }

    public boolean checkPassword(String password) {
        return this.password.equals(password);
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double calculateBMI() {
        double bmi = this.weight / (this.height * this.height);
        return bmi;
    }

    public Object getName() {
        return null;
    }

    public Object getNumMeasurements() {
        return null;
    }

    public Object getAverageBMI() {
        return null;
    }

    public void addBMI(double bmi) {
    }
}



