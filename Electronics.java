import java.util.UUID;

public abstract class Electronics {

    private final String manufacturer;  // 제조사
    private final String model;  // 모델명
    private final int inch;  // 인치
    private final String serialNum = UUID.randomUUID().toString().substring(0,13);  // 일련 번호

    abstract void connect();
    public Electronics(String manufacturer, String model, int inch) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.inch = inch;
    }

    public void getSerialNum() {  // 랜덤으로 생성된 일련 번호 리턴해주기
        System.out.println("일련 번호 : " + serialNum);
    }

    public void printInfo() {  // 제품 정보 알려주기
        System.out.println("이 제품은 " + manufacturer + " " + model + " " + inch + "인치 TV 입니다.");
    }
}
