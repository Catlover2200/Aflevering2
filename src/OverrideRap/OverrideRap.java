package OverrideRap;

    public class OverrideRap {
        public static void OverrideRapEx() {
            RapSong rapSong = new RapSong();
            rapSong.play();

            OldSchoolRap oldSchoolRap = new OldSchoolRap();
            oldSchoolRap.play();

            NewSchoolRap schoolRap = new NewSchoolRap();
            schoolRap.play();
        }
    }