import java.util.Arrays;

public class House  implements Conditionable {
    private int feeOfTrash;
    private int feeOfElectrocity;
    private int feeOfWater;
    private Person[] person;

    public House() {
    }

    public House(int feeOfTrash, int feeOfElectrocity, int feeOfWater,Person[] person) {
        this.feeOfTrash = feeOfTrash;
        this.feeOfElectrocity = feeOfElectrocity;
        this.feeOfWater = feeOfWater;
        this.person = person;
    }

    public int getFeeOfTrash() {
        return feeOfTrash;
    }

    public void setFeeOfTrash(int feeOfTrash) {
        this.feeOfTrash = feeOfTrash;
    }

    public int getFeeOfElectrocity() {
        return feeOfElectrocity;
    }

    public void setFeeOfElectrocity(int feeOfElectrocity) {
        this.feeOfElectrocity = feeOfElectrocity;
    }

    public int getFeeOfWater() {
        return feeOfWater;
    }

    public void setFeeOfWater(int feeOfWater) {
        this.feeOfWater = feeOfWater;
    }

    @Override
    public void utilityService() {
        int person = 5;
        int total = (person*feeOfTrash)+feeOfElectrocity+feeOfWater;
        System.out.println("Уйдо "+person+" адам жашайт \nЖалпы комуналдык чыгымы: "+total);
    }

    @Override
    public void apartmentFee() {

    }

    @Override
    public void feeOfNumber() {

    }

    @Override
    public String toString() {
        return "House{" +
                "feeOfTrash=" + feeOfTrash +
                ", feeOfElectrocity=" + feeOfElectrocity +
                ", feeOfWater=" + feeOfWater +
                ", person=" + Arrays.toString(person) +
                '}';
    }
}
