package org.exampledriven.grpc;

import com.netflix.discovery.EurekaClientConfig;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import org.exampledriven.grpc.services.Book;
import org.exampledriven.grpc.services.BookList;
import org.exampledriven.grpc.services.BookServiceGrpc;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class BookServiceGrpcClient {

    @Autowired
    EurekaClientConfig eurekaClientConfig;

//    @Autowired
//    ManagedChannel managedChannel;

    private Logger logger = LoggerFactory.getLogger(BookServiceGrpcClient.class);

    private BookServiceGrpc.BookServiceBlockingStub bookServiceBlockingStub;

    public BookList createBooks(List<Book> bookList) {

        BookList.Builder builder = BookList.newBuilder();
        bookList.forEach(builder::addBook);
        BookList request = builder.build();

        if (logger.isDebugEnabled()) {
            logger.debug("Request " + request);
        }
        BookList response = bookServiceBlockingStub.createBooks(request);
        if (logger.isDebugEnabled()) {
            logger.debug("Response " + response);
        }
        return response;

    }

    @PostConstruct
    private void initializeClient() {
    	ManagedChannel managedChannel= ManagedChannelBuilder.forAddress("dss-433.dsslp.com", 6565).usePlaintext(true).build();
        bookServiceBlockingStub = BookServiceGrpc.newBlockingStub(managedChannel);

    }

}
