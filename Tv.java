public class Tv extends Electronics implements RemoteControl{

    private int nowVolume = 15;
    private int nowChannel = 32;

    public Tv(String manufacturer, String model, int inch) {
        super(manufacturer, model, inch);
    }

    @Override
    public void turnOn() {
        System.out.println("TV가 켜졌습니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("TV가 꺼졌습니다.");
    }

    @Override
    public int adjustVolume(int volume) {
        System.out.println("볼륨을 " + volume + " 만큼 조정합니다.");
        if(volume > maxVolume - nowVolume) {
            volume = maxVolume;
            System.out.println("최대 볼륨은 30 입니다.");
        } else if(-nowVolume < volume && volume <= maxVolume - nowVolume) {
            volume += nowVolume;
        } else {
            volume = 0;
            System.out.println("음소거 상태입니다.");
        }
        return volume;
    }

    @Override
    public int changeChannel(int channel) {
        System.out.println("채널을 " + channel + " 번으로 이동합니다.");
        if(channel > maxChannel) {
            System.out.println("존재하지 않는 채널입니다.");
            return nowChannel;
        }
        return channel;
    }

    public void tvInfo() {
        System.out.println("현재 Channel : " + nowChannel + " 번 | Volume : " + nowVolume);
    }
}
