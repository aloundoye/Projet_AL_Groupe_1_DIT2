
package service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SupprimerUserResponse_QNAME = new QName("http://Service/", "supprimerUserResponse");
    private final static QName _ConnexionUserResponse_QNAME = new QName("http://Service/", "connexionUserResponse");
    private final static QName _AjouterUser_QNAME = new QName("http://Service/", "ajouterUser");
    private final static QName _SupprimerUser_QNAME = new QName("http://Service/", "supprimerUser");
    private final static QName _ModifierUser_QNAME = new QName("http://Service/", "modifierUser");
    private final static QName _GetUsersResponse_QNAME = new QName("http://Service/", "getUsersResponse");
    private final static QName _ConnexionUser_QNAME = new QName("http://Service/", "connexionUser");
    private final static QName _AjouterUserResponse_QNAME = new QName("http://Service/", "ajouterUserResponse");
    private final static QName _ModifierUserResponse_QNAME = new QName("http://Service/", "modifierUserResponse");
    private final static QName _GetUsers_QNAME = new QName("http://Service/", "getUsers");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AjouterUserResponse }
     * 
     */
    public AjouterUserResponse createAjouterUserResponse() {
        return new AjouterUserResponse();
    }

    /**
     * Create an instance of {@link ConnexionUser }
     * 
     */
    public ConnexionUser createConnexionUser() {
        return new ConnexionUser();
    }

    /**
     * Create an instance of {@link GetUsers }
     * 
     */
    public GetUsers createGetUsers() {
        return new GetUsers();
    }

    /**
     * Create an instance of {@link ModifierUserResponse }
     * 
     */
    public ModifierUserResponse createModifierUserResponse() {
        return new ModifierUserResponse();
    }

    /**
     * Create an instance of {@link ConnexionUserResponse }
     * 
     */
    public ConnexionUserResponse createConnexionUserResponse() {
        return new ConnexionUserResponse();
    }

    /**
     * Create an instance of {@link SupprimerUserResponse }
     * 
     */
    public SupprimerUserResponse createSupprimerUserResponse() {
        return new SupprimerUserResponse();
    }

    /**
     * Create an instance of {@link AjouterUser }
     * 
     */
    public AjouterUser createAjouterUser() {
        return new AjouterUser();
    }

    /**
     * Create an instance of {@link SupprimerUser }
     * 
     */
    public SupprimerUser createSupprimerUser() {
        return new SupprimerUser();
    }

    /**
     * Create an instance of {@link GetUsersResponse }
     * 
     */
    public GetUsersResponse createGetUsersResponse() {
        return new GetUsersResponse();
    }

    /**
     * Create an instance of {@link ModifierUser }
     * 
     */
    public ModifierUser createModifierUser() {
        return new ModifierUser();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupprimerUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "supprimerUserResponse")
    public JAXBElement<SupprimerUserResponse> createSupprimerUserResponse(SupprimerUserResponse value) {
        return new JAXBElement<SupprimerUserResponse>(_SupprimerUserResponse_QNAME, SupprimerUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConnexionUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "connexionUserResponse")
    public JAXBElement<ConnexionUserResponse> createConnexionUserResponse(ConnexionUserResponse value) {
        return new JAXBElement<ConnexionUserResponse>(_ConnexionUserResponse_QNAME, ConnexionUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AjouterUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "ajouterUser")
    public JAXBElement<AjouterUser> createAjouterUser(AjouterUser value) {
        return new JAXBElement<AjouterUser>(_AjouterUser_QNAME, AjouterUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupprimerUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "supprimerUser")
    public JAXBElement<SupprimerUser> createSupprimerUser(SupprimerUser value) {
        return new JAXBElement<SupprimerUser>(_SupprimerUser_QNAME, SupprimerUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifierUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "modifierUser")
    public JAXBElement<ModifierUser> createModifierUser(ModifierUser value) {
        return new JAXBElement<ModifierUser>(_ModifierUser_QNAME, ModifierUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "getUsersResponse")
    public JAXBElement<GetUsersResponse> createGetUsersResponse(GetUsersResponse value) {
        return new JAXBElement<GetUsersResponse>(_GetUsersResponse_QNAME, GetUsersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConnexionUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "connexionUser")
    public JAXBElement<ConnexionUser> createConnexionUser(ConnexionUser value) {
        return new JAXBElement<ConnexionUser>(_ConnexionUser_QNAME, ConnexionUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AjouterUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "ajouterUserResponse")
    public JAXBElement<AjouterUserResponse> createAjouterUserResponse(AjouterUserResponse value) {
        return new JAXBElement<AjouterUserResponse>(_AjouterUserResponse_QNAME, AjouterUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifierUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "modifierUserResponse")
    public JAXBElement<ModifierUserResponse> createModifierUserResponse(ModifierUserResponse value) {
        return new JAXBElement<ModifierUserResponse>(_ModifierUserResponse_QNAME, ModifierUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service/", name = "getUsers")
    public JAXBElement<GetUsers> createGetUsers(GetUsers value) {
        return new JAXBElement<GetUsers>(_GetUsers_QNAME, GetUsers.class, null, value);
    }

}
