package fr.smabtp.ro.dto.security;

import fr.smabtp.ro.dto.ldap.Person;
import org.springframework.security.core.CredentialsContainer;
import org.springframework.security.core.userdetails.UserDetails;

public interface IUserExtended extends UserDetails, CredentialsContainer {

    Person getPerson();

}
