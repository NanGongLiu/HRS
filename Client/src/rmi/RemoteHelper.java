package rmi;

import java.rmi.Remote;

import dataService.DataFactoryService;


public class RemoteHelper {
	private Remote remote;
	private static RemoteHelper remoteHelper = new RemoteHelper();
	public static RemoteHelper getInstance(){
		return remoteHelper;
	}
	
	private RemoteHelper() {
	}
	
	public void setRemote(Remote remote){
		this.remote = remote;
	}
	public DataFactoryService getDataFactoryService(){
		return (DataFactoryService)remote;
	}
}