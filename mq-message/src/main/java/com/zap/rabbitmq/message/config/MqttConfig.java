package com.zap.rabbitmq.message.config;


import lombok.extern.slf4j.Slf4j;

/**
 * @ClassName MqttConfig
 * @Author Evan
 * @Descrption
 * @create 2022/11/10 16:30
 */
@Slf4j
//@Configuration
//@IntegrationComponentScan
public class MqttConfig {
//    @Value("${mqtt.username}")
//    private String username;
//
//    @Value("${mqtt.password}")
//    private String password;
//
//    @Value("${mqtt.host}")
//    private String hostUrl;
//
//    @Value("${mqtt.clientId}")
//    private String clientId;
//
//    @Value("${mqtt.topic}")
//    private String defaultTopic;
//
//    // 连接超时
//    @Value("${mqtt.timeout}")
//    private int completionTimeout;
//
//    @Bean
//    public MqttConnectOptions getMqttConnectOptions() {
//        MqttConnectOptions mqttConnectOptions = new MqttConnectOptions();
//        mqttConnectOptions.setCleanSession(true);
//        mqttConnectOptions.setConnectionTimeout(10);
//        mqttConnectOptions.setKeepAliveInterval(90);
//        mqttConnectOptions.setAutomaticReconnect(true);
//        mqttConnectOptions.setUserName(username);
//        mqttConnectOptions.setPassword(password.toCharArray());
//        mqttConnectOptions.setServerURIs(new String[]{hostUrl});
//        mqttConnectOptions.setKeepAliveInterval(2);
//        return mqttConnectOptions;
//    }
//
//    @Bean
//    public MqttPahoClientFactory mqttClientFactory() {
//        DefaultMqttPahoClientFactory factory = new DefaultMqttPahoClientFactory();
//        factory.setConnectionOptions(getMqttConnectOptions());
//        return factory;
//    }
//
//    @Bean
//    @ServiceActivator(inputChannel = "mqttOutboundChannel")
//    public MessageHandler mqttOutbound() {
//        MqttPahoMessageHandler messageHandler = new MqttPahoMessageHandler(clientId, mqttClientFactory());
//        messageHandler.setAsync(true);
//        messageHandler.setDefaultTopic(defaultTopic);
//        return messageHandler;
//    }
//
//    @Bean
//    public MessageChannel mqttOutboundChannel() {
//        DirectChannel directChannel = new DirectChannel();
//        return directChannel;
//    }
//
//    // 接收通道
//    @Bean
//    public MessageChannel mqttInputChannel() {
//        DirectChannel directChannel = new DirectChannel();
//        return directChannel;
//    }
//
//    // 配置client,监听的topic
//    @Bean
//    public MessageProducer inbound() {
//        MqttPahoMessageDrivenChannelAdapter adapter = new MqttPahoMessageDrivenChannelAdapter(clientId + "_inbound",
//                mqttClientFactory(), "test/#");
//        adapter.setCompletionTimeout(completionTimeout);
//        adapter.setConverter(new DefaultPahoMessageConverter());
//        adapter.setQos(1);
//        adapter.setOutputChannel(mqttInputChannel());
//        return adapter;
//    }
//
//    // 通过通道获取数据
//    @Bean
//    @ServiceActivator(inputChannel = "mqttInputChannel")
//    public MessageHandler handler() {
//        return message -> {
//            String topic = (String)message.getHeaders().get("mqtt_receivedTopic");
//            log.info("主题：{}，消息接收到的数据：{}", topic, message.getPayload());
//        };
//    }
}

