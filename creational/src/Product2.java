public class Product2 {
    private String featureA, featureB, featureC;
    public void setFeatureA(String featureA) {
        this.featureA = featureA;
    }
    public void setFeatureB(String featureB) {
        this.featureB = featureB;
    }
    public void setFeatureC(String featureC) {
        this.featureC = featureC;
    }
    @Override
    public String toString() {
        return "Product2 { " + featureA + ", " + featureB + ", " + featureC + " }";
    }
}
