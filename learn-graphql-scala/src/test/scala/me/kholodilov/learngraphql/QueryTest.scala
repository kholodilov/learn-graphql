package me.kholodilov.learngraphql

import org.scalatest.FlatSpec
import sangria.macros._
import sangria.execution._
import sangria.marshalling.circe._
import io.circe.Json

import scala.concurrent.duration._
import scala.concurrent.{Await, ExecutionContext}

class QueryTest extends FlatSpec {

  implicit val ec = ExecutionContext.global

  val query =
    graphql"""
    fragment ProductFields on Product { id, name, description }
    query MyProduct {
      product(id: "1") {
        picture(size: 500) {
          url
        }
      }

      products {
        ... ProductFields
      }
    }
  """

  it should "execute query" in {
    println(Await.result(Executor.execute(schema, query, new ProductRepo), 5 seconds))
  }

}
