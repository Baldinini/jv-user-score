package core.basesyntax;

import core.basesyntax.exception.UserNotFoundException;

public class UserService {

    public int getUserScore(String[] records, String email) {
        for (String record : records) {
            String[] emailScoreRecord = record.split(":");

            if (emailScoreRecord[0].equals(email)) {
                return Integer.parseInt(emailScoreRecord[1]);
            }
        }
        throw new UserNotFoundException("User with given email doesn't exist");
    }
}

