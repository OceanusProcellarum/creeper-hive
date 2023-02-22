package joshavn.creepermod;

import joshavn.creepermod.util.Reference;

import net.minecraftforge.fml.common.Mod;

@Mod(value = Reference.MOD_ID)
public class Main {
	
	public static final CreativeTabs CREEPER_HIVE_TAB = new TabBase("tabCreeperHive");
	
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event)
	{
		RegistryHandler.preInitRegisteries();
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event)
	{
		
	}
	
	@EventHandler
	public static void Postinit(FMLPostInitializationEvent event)
	{
		
	}
	
}