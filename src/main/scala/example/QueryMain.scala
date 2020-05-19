package example

import java.lang.Math
import software.amazon.awssdk.services.dynamodb.DynamoDbAsyncClient
import software.amazon.awssdk.services.dynamodb.model.{AttributeValue, GetItemRequest, PutItemRequest}

import scala.jdk.CollectionConverters._
import scala.compat.java8.FutureConverters._
import scala.concurrent.{ExecutionContext, Future}


class QueryMain {
  private lazy val client: DynamoDbAsyncClient = {
    DynamoDbAsyncClient
      .builder()
      //.endpointOverride(config.endpoint)
      //.region(config.region)
      .build()
  }

  def getItem(tableName: String, keys: Map[String, String])(
    implicit ec:         ExecutionContext
  ): Future[Map[String, AttributeValue]] = {
    val key = keys.mapValues(AttributeValue.builder().s(_).build())
    val request = GetItemRequest.builder().tableName(tableName).key(key.toMap.asJava).build()
    client.getItem(request).toScala.map(_.item().asScala.toMap)
    //.filter(_.keys.toSeq.intersect(keys.keys.toSeq).nonEmpty)
  }
}
