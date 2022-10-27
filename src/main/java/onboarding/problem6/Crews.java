package onboarding.problem6;

import java.util.ArrayList;
import java.util.List;

public class Crews {

    private List<Crew> crews;
    private InvalidEmails invalidEmails;

    public Crews() {
        this.crews = new ArrayList<>();
        this.invalidEmails = new InvalidEmails();
    }

    public void add(Crew crew) {
        validateContainNickNameContinuously(crew.getNickName());
        crews.add(crew);
    }

    private void validateContainNickNameContinuously(String nickName) {
        List<Crew> removeCrewList = new ArrayList<>();
        crews.stream()
                .filter(crew -> nickNameFilter(crew.getNickName(), nickName))
                .forEach(crew -> {
                    removeCrewList.add(crew);
                    invalidEmails.add(crew.getEmail());
        });
        crews.removeAll(removeCrewList);
    }

    private boolean nickNameFilter(String crewNickName, String nickName) {
        int count = 0;
        for (char crewNickNameChar : crewNickName.toCharArray()) {
            boolean isContain = false;
            if (count == 2) {
                return true;
            }
            for (char nickNameChar : nickName.toCharArray()) {
                if (crewNickNameChar == nickNameChar) {
                    count++;
                    isContain = true;
                    break;
                }
            }
            if (!isContain) {
                count = 0;
            }
        }
        return false;
    }

    public List<String> getEmails() {
        return invalidEmails.getEmailsAsc();
    }
}
