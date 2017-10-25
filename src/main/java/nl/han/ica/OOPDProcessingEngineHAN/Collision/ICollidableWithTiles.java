package nl.han.ica.OOPDProcessingEngineHAN.Collision;

import java.util.List;

/**
 * Make your GameObject implement this interface if you want your GameObject to
 * be collidable with TileBuilder.
 */
public interface ICollidableWithTiles {

	/**
	 * This method will be triggered when a GameObject has collided with TileBuilder.
	 * 
	 * @param collidedTiles
	 */
	public void tileCollisionOccurred(List<CollidedTile> collidedTiles);
}
