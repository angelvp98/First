package com.angelvp98.first;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.event.lifecycle.*;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

public class SideProxy {
    SideProxy(){
        FMLJavaModLoadingContext.get().getModEventBus().addListener(SideProxy::commonSetup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(SideProxy::enqueueIMC);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(SideProxy::processIMC);
        MinecraftForge.EVENT_BUS.addListener(SideProxy::onServerStarting);
    }

    private static void commonSetup(FMLCommonSetupEvent event){
        First.LOGGER.debug("commonSetum for First");
    }

    private static void enqueueIMC(final InterModEnqueueEvent event){

    }

    private static void processIMC(final InterModProcessEvent event){

    }

    private static void onServerStarting(FMLServerStartingEvent event){

    }

    static class Client extends SideProxy{
        Client(){
            FMLJavaModLoadingContext.get().getModEventBus().addListener(Client::clientSetup);
        }

        private static void clientSetup(FMLClientSetupEvent event){

        }

    }

    static class Server extends SideProxy{
        Server(){
            FMLJavaModLoadingContext.get().getModEventBus().addListener(Server::serverSetup);
        }

        private static void serverSetup(FMLDedicatedServerSetupEvent event){

        }
    }
}
