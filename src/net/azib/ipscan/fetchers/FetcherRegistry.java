/**
 * 
 */
package net.azib.ipscan.fetchers;

import java.util.Collection;

/**
 * FetcherRegistry
 *
 * @author anton
 */
public interface FetcherRegistry {

	/**
	 * @return a List of all registered Fetchers
	 */
	public Collection getRegisteredFetchers();
	
	/**
	 * @return a List of selected Fetchers only
	 */
	public Collection getSelectedFetchers();

	/**
	 * Searches for selected fetcher with the given label
	 * @param label
	 * @return the index, if found, or -1
	 */
	public int getSelectedFetcherIndex(String label);

	/**
	 * Updates the list, retaining only items that are passed in the array.
	 * The order of elements will be the same as in the array.
	 * 
	 * @param names
	 */
	public void updateSelectedFetchers(String[] names);

	/**
	 * Adds a listener to observe FetcherRegistry events, like modification of selected fetchers.
	 * @param listener
	 */
	public void addListener(FetcherRegistryUpdateListener listener);

}
