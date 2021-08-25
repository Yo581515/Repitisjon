package torsdag;

import java.util.List;

/**
 *
 * @author soh
 *
 */
public interface Graf {
    /*
       * Forklaring som normalt ikkje ville vore med Alle metodane i eit interface er
     * public. Difor er det vanleg � utelate public. Det er lov  ta med public.
     *
     */
    /**
     *
     * @return antal nodar i grafen.
     */
    int getAntallNoder();

    /**
     *
     * @return antal kantar i grafen.
     */
    int getAntallKanter();

    /**
     *
     * Metoden gir oss alle nodenavn i grafen. De trenger ikke komme i en bestemt
     * rekkef�lge.
     *
     * @return liste av namn p� alle nodane i grafen
     */
    List<String> alleNoder();

    /**
     * Metode som avgjer om to nodar er naboar.
     *
     * @param u fra node.
     * @param v til node.
     * @return true dersom u og v er naboar, false elles.
     */
    boolean erNaboer(String u, String v);

    /**
     * Legg ein ny node til grafen. Denne metoden treng ikkje fungere. Man kan bare
     * la metoden returnere false.
     *
     * @param w node som skal leggast til.
     * @return true dersom noden ikkje finst fr� f�r, false elles.
     */
    boolean leggTilNode(String w);

    /**
     * Legg til ein kant mellom nodane u og v i grafen.
     *
     * @param u fr� node.
     * @param v til node.
     * @return true om kanten er lagt til, false om u eller v ikkje er lovlige
     *         nodenavn. Ogs� false om kanten finst fr� f�r.
     */
    boolean leggTilKant(String u, String v);

    /**
     * Metoden kan legge flere kanter til i en operasjon
     *
     * @param w      node i grafen
     * @param naboer Tabell med noder som skal bli nabo med w
     * @return true dersom ingen kanter finnes i grafen fra f�r, false elles. Dersom
     *         en kant finnes fra f�r, blir ingen kanter lagt til.
     */
    boolean leggTilKanter(String w, String[] naboer);

    /**
     * Fjerner en kant i grafen.
     *
     * @param u node i grafen.
     * @param v node i grafen.
     * @return true dersom det var en kant mellom u og v i grafen, false elles.
     */
    boolean fjern(String u, String v);

    /**
     * Henter en liste av alle naboene til en gitt node.
     *
     * @param w node i grafen.
     * @return Liste med alle naboene til w.
     */
    List<String> getNaboer(String w);

    
    String[] getNavn();
    void printUt();
}
