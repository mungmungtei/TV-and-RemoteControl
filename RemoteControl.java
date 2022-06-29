public interface RemoteControl {

    int maxVolume = 30;  // 볼륨 범위 0~30
    int maxChannel = 990;  // 채널 범위 0~990번

    public void turnOn();
    public void turnOff();

    public int adjustVolume(int volume);

    public int changeChannel(int channel);

}
