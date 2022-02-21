package challenge;

import java.util.ArrayList;
import java.util.List;

public interface ISaveable {
    List save(List medium);

    void load(ArrayList parameters);
}
