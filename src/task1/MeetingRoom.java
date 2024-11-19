package task1;

import java.util.ArrayList;
import java.util.List;

public class MeetingRoom {
    List<Training> candidati;

    public MeetingRoom(List<Training> candidati) {
        this.candidati = candidati;
    }

    void startTraining() {
        for (Training candidati : candidati) {
            candidati.canAttendTraining();
        }
    }
}
