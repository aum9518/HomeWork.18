import java.util.Arrays;

public class Appartment implements Conditionable{
    private int feeOfApartment;
    private int feeOfTrash;
    private int feeOfElectrocity;
    private int feeOfWater;
    private Person[] person;

    public Appartment() {
    }

    public Appartment(int feeOfApartment, int feeOfTrash, int feeOfElectrocity, int feeOfWater,Person[] person) {
        this.feeOfApartment = feeOfApartment;
        this.feeOfTrash = feeOfTrash;
        this.feeOfElectrocity = feeOfElectrocity;
        this.feeOfWater = feeOfWater;
        this.person = person;
    }

    public int getFeeOfApartment() {
        return feeOfApartment;
    }

    public void setFeeOfApartment(int feeOfApartment) {
        this.feeOfApartment = feeOfApartment;
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
         int person = 3;
        int total = (person*feeOfTrash)+feeOfApartment+feeOfElectrocity+feeOfWater;
        System.out.println("Уйдо "+person+" адам жашайт."+"\nЖалпы чыгымы: "+total);
    }

    @Override
    public void apartmentFee() {
        System.out.println("Квартира толому: "+feeOfApartment);
    }

    @Override
    public void feeOfNumber() {

    }

    @Override
    public String toString() {
        return "Appartment{" +
                "feeOfApartment=" + feeOfApartment +
                ", feeOfTrash=" + feeOfTrash +
                ", feeOfElectrocity=" + feeOfElectrocity +
                ", feeOfWater=" + feeOfWater +
                ", person=" + Arrays.toString(person) +
                '}';
    }
}

