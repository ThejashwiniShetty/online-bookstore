//package com.theju.bookstore.config;
//
//import java.net.InetAddress;
//import java.net.UnknownHostException;
//import java.util.List;
//
//import org.elasticsearch.client.Client;
//import org.elasticsearch.client.transport.TransportClient;
//import org.elasticsearch.common.settings.Settings;
//import org.elasticsearch.common.transport.TransportAddress;
//import org.elasticsearch.transport.client.PreBuiltTransportClient;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class BookStoreSpringConfiguration {
//	
//	@Value("obs.es.cluster.name")
//	private String clusterName;
//	
//	@Value("obs.es.sniff")
//	private String elasticsearchSniff;
//	
//	@Value("obs.es.transportClient.address")
//	private List<String> transportAddresses;
//
//	@Bean(name = "esClient")
//	public Client esClient() throws NumberFormatException, UnknownHostException {
//
//		TransportClient client = null;
//		Settings.Builder settingsBuilder = Settings.builder();
//		settingsBuilder.put("cluster.name", clusterName);
//		settingsBuilder.put("client.transport.sniff", elasticsearchSniff);
//
//		Settings settings = settingsBuilder.build();
//		client = new PreBuiltTransportClient(settings);
//
//		TransportAddress transports[] = new TransportAddress[transportAddresses.size()];
//
//		for (int i = 0; i < transportAddresses.size(); i++) {
//			String splitAddress[] = transportAddresses.get(i).split(":");
//			transports[i] = new TransportAddress(InetAddress.getByName(splitAddress[0]), Integer.parseInt(splitAddress[1]));
//		}
//		client.addTransportAddresses(transports);
//		return client;
//	}
//}
