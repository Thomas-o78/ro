/*
package fr.smabtp.ro.services.impl;

import fr.smabtp.ro.UserSession;
import fr.smabtp.ro.dto.security.IUserExtended;
import fr.smabtp.ro.services.IUserService;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

    @Override
    public UserSession getInSession() {
        final IUserExtended userExtended = getUserExtended();
        if(userExtended == null){
            return null;
        }
        return new UserSession(userExtended.getUsername().toUpperCase(), userExtended.getPerson().getDisplayName());
    }

    private static IUserExtended getUserExtended() {
        final Object principal = SecurityContextHolder.getContext()
                .getAuthentication().getPrincipal();
        if (principal instanceof IUserExtended) {
            return (IUserExtended) principal;
        }
        return null;
    }

}
*/
