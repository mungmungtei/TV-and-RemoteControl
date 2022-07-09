public class Main {
    public static void main(String[] args) {

        Tv tv01 = new Tv("LG", "올레드 오브제컬렉션 evo", 65);
        tv01.connect();
        tv01.printInfo();  // 이 제품은 LG 올레드 오브제컬렉션 evo 65인치 TV 입니다.
        tv01.getSerialNum();  // 일련 번호 : 7c7b51c4-3184 (실행 시, 랜덤으로 계속 바뀜)
        System.out.println("----------------------------------------------");
        tv01.turnOn();  // TV가 켜졌습니다.
        tv01.tvInfo();  // 현재 Channel : 32 번 | Volume : 15
        System.out.println("Volume : " + tv01.adjustVolume(5));  // 볼륨을 5 만큼 조정합니다. Volume : 20
        System.out.println("Channel : " + tv01.changeChannel(999));  // 채널을 999 번으로 이동합니다. 존재하지 않는 채널입니다. Channel : 32
        tv01.turnOff(); // TV가 꺼졌습니다.

        System.out.println("\n");

        Tv tv02 = new Tv("삼성", "Crystal UHD", 85);
        tv02.connect();
        tv02.printInfo(); // 이 제품은 삼성 Crystal UHD 85인치 TV 입니다.
        tv02.getSerialNum(); // 일련 번호 : 7a22098e-aa19
        System.out.println("----------------------------------------------");
        tv02.turnOn(); // TV가 켜졌습니다.
        tv02.tvInfo(); // 현재 Channel : 32 번 | Volume : 15
        System.out.println("Volume : " + tv02.adjustVolume(-10)); // 볼륨을 -10 만큼 조정합니다. Volume : 5
        System.out.println("Channel : " + tv02.changeChannel(11)); // 채널을 11 번으로 이동합니다. Channel : 11
        tv02.turnOff(); // TV가 꺼졌습니다.
    }
}
