package com.victor.mq;

import com.alibaba.rocketmq.client.exception.MQBrokerException;
import com.alibaba.rocketmq.client.exception.MQClientException;
import com.alibaba.rocketmq.client.producer.DefaultMQProducer;
import com.alibaba.rocketmq.common.message.Message;
import com.alibaba.rocketmq.remoting.exception.RemotingException;

/**
 * Created by zhangcs on 2018/4/23.
 */
public class Producer {

    public static void main(String[] args) {
        DefaultMQProducer producer = new DefaultMQProducer("testProducer");
        producer.setNamesrvAddr("10.3.8.22:9876");

        try {
            producer.start();

            Message message = new Message("testProducer", "tagA", "hello victor".getBytes());

            producer.send(message);

            producer.shutdown();

        } catch (MQClientException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (RemotingException e) {
            e.printStackTrace();
        } catch (MQBrokerException e) {
            e.printStackTrace();
        }

    }
}

class B{

}

abstract class A extends B{

}

