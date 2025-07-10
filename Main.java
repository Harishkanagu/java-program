public class collegestudent {
    public interface Students {

        void playing();
    }
    class CollegeStudent extends Tasks.Student {
        public void study() {
            System.out.println("The  student is playing Badminton");
        }
    }
    public class Main {
        public static void main(String[] args) {
            Tasks.Student s = new Tasks.CollegeStudent();
            s.playing();
        }
    }
}
}
