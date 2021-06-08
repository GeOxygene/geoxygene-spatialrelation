/*******************************************************************************
 * This software is released under the licence CeCILL
 * 
 * see Licence_CeCILL-C_fr.html see Licence_CeCILL-C_en.html
 * 
 * see <a href="http://www.cecill.info/">http://www.cecill.info/a>
 * 
 * @copyright IGN
 ******************************************************************************/
package fr.ign.cogit.geoxygene.spatialrelation.api;

/**
 * Assessing a relation may require a condition to be specified, i.e. the
 * {@link RelationExpression}. This condition may refer to a threshold (e.g. two
 * features are near if their relative distance is less than 10m), to other
 * relations (e.g. two features are aligned if they are near and parallel) or to
 * other elements like an intersection matrix template.
 * 
 * @author GTouya
 * 
 */
public interface RelationExpression {

}
