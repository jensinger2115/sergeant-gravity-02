import NutzerVerwaltung;
import Nutzerverwaltung;

public class ProxyNutzerVerwaltung extends NutzerVerwaltung
{
    /** Attributes */
    /**
     * 
     */
    private ProxyNutzerverwaltung instance;
    /** Associations */
    private Nutzerverwaltung unnamed_3;
    /**
     * Operation login
     *
     * @param nutzerID - 
     * @return boolean
     */
    public boolean login ( String nutzerID ){}
    /**
     * Operation logout
     *
     * @param nutzerID - 
     * @return boolean
     */
    public boolean logout ( String nutzerID ){}
    /**
     * Operation NutzerZfg
     *
     * @param nutzerName - 
     * @param passwort - 
     * @return boolean
     */
    public boolean NutzerZfg ( String nutzerName, String passwort ){}
    /**
     * Operation nutzerLsn
     *
     * @param nutzerID - 
     * @return 
     */
    public nutzerLsn ( String nutzerID ){}
    /**
     * Operation hauptNutzerWechsel
     *
     * @param nutzerID - 
     * @return boolean
     */
    public boolean hauptNutzerWechsel ( String nutzerID ){}
    /**
     * Operation nutzerIDVergeben
     *
     * @param nutzerID - 
     * @return boolean
     */
    public boolean nutzerIDVergeben ( String nutzerID ){}
    /**
     * Operation istEingelogt
     *
     * @param nutzerID - 
     * @return boolean
     */
    public boolean istEingelogt ( String nutzerID ){}
    /**
     * Operation istAdmin
     *
     * @param nutzerID - 
     * @return boolean
     */
    public boolean istAdmin ( String nutzerID ){}
    /**
     * Operation getInstance
     *
     * @return ProxyNutzerverwaltung
     */
    public ProxyNutzerverwaltung getInstance (  ){}
}

