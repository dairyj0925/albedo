package ws.vinta.albedo

import java.sql.Timestamp

import org.apache.spark.sql.types._

package object schemas {
  case class RawStarring(
                          id: Int,
                          from_user_id: Int,
                          from_username: String,
                          repo_owner_id: Int,
                          repo_owner_username: String,
                          repo_owner_type: String,
                          repo_id: Int,
                          repo_name: String,
                          repo_full_name: String,
                          repo_url: String,
                          repo_language: String,
                          repo_description: String,
                          repo_created_at: Timestamp,
                          starred_at: Timestamp,
                          stargazers_count: Timestamp,
                          forks_count: Timestamp
                        )

  val rawStarringSchema = StructType(
    Array(
      StructField("id", IntegerType, nullable = false),
      StructField("from_user_id", IntegerType, nullable = false),
      StructField("from_username", StringType, nullable = false),
      StructField("repo_owner_id", IntegerType, nullable = false),
      StructField("repo_owner_username", StringType, nullable = false),
      StructField("repo_owner_type", StringType, nullable = false),
      StructField("repo_id", IntegerType, nullable = false),
      StructField("repo_name", StringType, nullable = false),
      StructField("repo_full_name", StringType, nullable = false),
      StructField("repo_url", StringType, nullable = false),
      StructField("repo_language", StringType, nullable = false),
      StructField("repo_description", StringType, nullable = false),
      StructField("repo_created_at", TimestampType, nullable = false),
      StructField("repo_updated_at", TimestampType, nullable = false),
      StructField("starred_at", TimestampType, nullable = false),
      StructField("stargazers_count", IntegerType, nullable = false),
      StructField("forks_count", IntegerType, nullable = false)
    )
  )

  case class Starring(user: Int, item: Int, star: Int, starred_at: Timestamp)

  val starringSchema = StructType(
    Array(
      StructField("user", IntegerType, nullable = false),
      StructField("item", IntegerType, nullable = false),
      StructField("star", IntegerType, nullable = false),
      StructField("starred_at", TimestampType, nullable = false)
    )
  )

  case class PopularItem(item: Int, stars: Int)
}