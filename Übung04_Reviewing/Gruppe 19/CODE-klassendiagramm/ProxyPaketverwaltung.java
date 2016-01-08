import ProxyPaketverwaltung;
import Paketverwaltung;
import Nutzerverwaltung;

public class ProxyPaketverwaltung extends Paketverwaltung
{
    /** Attributes */
    /**
     * 
     */
    private ProxyPaketverwaltung instance;
    /** Associations */
    private Nutzerverwaltung unnamed_2;
    /**
     * Operation verfügbarePakete
     *
     * @return String[*]
     */
    public String[*] verfügbarePakete (  ){}
    /**
     * Operation modellZfg
     *
     * @param modellID - 
     * @return boolean
     */
    public boolean modellZfg ( String modellID ){}
    /**
     * Operation modellLsn
     *
     * @param modellID - 
     * @return boolean
     */
    public boolean modellLsn (  modellID ){}
    /**
     * Operation nutzterZfg
     *
     * @param NutzerID - 
     * @return boolean
     */
    public boolean nutzterZfg ( String NutzerID ){}
    /**
     * Operation nutzerLsn
     *
     * @param nutzerID - 
     * @return boolean
     */
    public boolean nutzerLsn ( String nutzerID ){}
    /**
     * Operation paketErstellen
     *
     * @param paketName - 
     * @return int
     */
    public int paketErstellen ( String paketName ){}
    /**
     * Operation paketLsn
     *
     * @param paketID - 
     * @return boolean
     */
    public boolean paketLsn ( String paketID ){}
    /**
     * Operation modellHerunterladen
     *
     * @param modellID - 
     * @return file
     */
    public file modellHerunterladen ( String modellID ){}
    /**
     * Operation getInstance
     *
     * @return ProxyPaketverwaltung
     */
    public ProxyPaketverwaltung getInstance (  ){}
}

