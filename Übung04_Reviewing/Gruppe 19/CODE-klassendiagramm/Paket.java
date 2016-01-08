import Modell;

public class Paket

{
    /** Attributes */
    /**
     * 
     */
    private String packetName;
    /**
     * 
     */
    private String hauptnutzerID;
    /**
     * 
     */
    private path[*] arrayModelle;
    /** Associations */
    private Modell unnamed_10;
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
     * Operation nutzerZfg
     *
     * @param nutzerID - 
     * @return boolean
     */
    public boolean nutzerZfg ( String nutzerID ){}
    /**
     * Operation nutzerLsn
     *
     * @param nutzerID - 
     * @return boolean
     */
    public boolean nutzerLsn ( String nutzerID ){}
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
     * @param nutzerId - 
     * @return boolean
     */
    public boolean hauptnutzerWechseln ( String nutzerId ){}
}

