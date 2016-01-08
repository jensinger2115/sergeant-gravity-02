
public abstract class Adapter

{
    /**
     * Operation Initialisieren
     *
     * @return boolean
     */
    public boolean Initialisieren (  );

    /**
     * Operation PluginAnfrage
     *
     * @param algorithmusID - 
     * @param datensatzID - 
     * @return boolean
     */
    public boolean PluginAnfrage ( String algorithmusID, int datensatzID );

}

