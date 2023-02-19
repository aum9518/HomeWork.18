public class Hotel implements Conditionable{
    private int feeOfNumber;

    public Hotel() {
    }

    public Hotel(int feeOfNumber) {
        this.feeOfNumber = feeOfNumber;
    }

    public int getFeeOfNumber() {
        return feeOfNumber;
    }

    public void setFeeOfNumber(int feeOfNumber) {
        this.feeOfNumber = feeOfNumber;
    }

    @Override
    public void utilityService() {

    }

    @Override
    public void apartmentFee() {

    }

    @Override
    public void feeOfNumber() {
        System.out.println("Номерде 2 адам жашайт."+"\nНомердин толому: "+feeOfNumber);
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "feeOfNumber=" + feeOfNumber +
                '}';
    }
}
