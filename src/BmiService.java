public class BmiService {
    public int calculate(int height , double weight) {

        double bmindex = height / (weight * weight);

        return (int) bmindex;
    }

}
