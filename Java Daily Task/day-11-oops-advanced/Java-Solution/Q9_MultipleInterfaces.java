
public class Q9_MultipleInterfaces {

    interface Camera {
        void takePhoto();
    }

    interface MusicPlayer {
        void playMusic();
    }

    static class Smartphone implements Camera, MusicPlayer {
        @Override
        public void takePhoto() {
            System.out.println("Taking a photo");
        }

        @Override
        public void playMusic() {
            System.out.println("Playing music");
        }
    }

    public static void main(String[] args) {
        Smartphone phone = new Smartphone();

        phone.takePhoto();
        phone.playMusic();
    }
}
