import Paketverwaltung;
import ProxyPaketverwaltung;
import Paket;

public class Paketverwaltung extends Paketverwaltung
{
    /** Attributes */
    /**
     * 
     */
    private Paketverwaltung instance;
    /** Associations */
    private ProxyPaketverwaltung unnamed_20;
    private Paket unnamed_9;
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
    public boolean modellLsn ( String modellID ){}
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
     * Operation hauptnutzerWechseln
     *
     * @param nutzerID - 
     * @return boolean
     */
    public boolean hauptnutzerWechseln ( String nutzerID ){}
    /**
     * Operation getInstance
     *
     * @return Paketverwaltung
     */
    public Paketverwaltung getInstance (  ){}
}

