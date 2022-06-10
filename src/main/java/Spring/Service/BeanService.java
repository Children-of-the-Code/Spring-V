package Spring.Service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/*
what's the difference between @component and @service?
nothing.. there is effectively no difference
the only difference is that stereotyped annotations may have some preset properties like its scope
they are more or less just for developers to designate classes as a certain type of component for themselves
 */

//@Component
@Service
public class BeanService {
    /*
    we'd make an autowired constructor that wires in a repository..
    we'd make service methods that interact with said repository...
     */
}
