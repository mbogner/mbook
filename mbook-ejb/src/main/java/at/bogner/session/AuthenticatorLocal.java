package at.bogner.session;

import javax.ejb.Local;

/**
 *
 * @author manuel
 */
@Local
public interface AuthenticatorLocal {

    boolean authenticate();
}
