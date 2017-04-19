package com.equalinformation.evaloss.temp.scala

/**
  * Created by bpupadhyaya on 4/18/2017.
  */
case class IntermediateRating(  name: String,
                                expRating: Float,
                                commRating: Float,
                                docRating: Float,
                                codeInfRating: Float
                            )
case class Product( name: String,
                    r1: IntermediateRating,
                    r2: IntermediateRating,
                    r3: IntermediateRating,
                    r4: IntermediateRating,
                    r5: IntermediateRating
                  )
case class EvalParam(name: String, value: Float)
object EvalOSSEngine {
  def main(args: Array[String]): Unit = {
    val evalParams = Map( 1 -> "Team skills",
                          2 -> "Features",
                          3 -> "Cost of acquiring tool",
                          4 -> "Productivity",
                          5 -> "Reliability"
                        )
    val inputParams = Set(EvalParam(evalParams(1), 0.2f),
                          EvalParam(evalParams(2), 0.25f),
                          EvalParam(evalParams(3), 0.15f),
                          EvalParam(evalParams(4), 0.3f),
                          EvalParam(evalParams(5), 0.1f)
                        )
    val recomProducts = List( Product("Eclipse",
                                IntermediateRating(evalParams(1), 90, 95, 90, 85),
                                IntermediateRating(evalParams(2), 85, 90, 85, 85),
                                IntermediateRating(evalParams(3), 100, 100, 100, 100),
                                IntermediateRating(evalParams(4), 80, 85, 85, 90),
                                IntermediateRating(evalParams(5), 90, 85, 95, 90)
                              ),
                              Product("intelliJ",
                                IntermediateRating(evalParams(1), 80, 90, 85, 90),
                                IntermediateRating(evalParams(2), 95, 95, 100, 95),
                                IntermediateRating(evalParams(3), 90, 90, 95, 90),
                                IntermediateRating(evalParams(4), 95, 100, 100, 95),
                                IntermediateRating(evalParams(5), 90, 95, 95, 90)
                              )
                        )
    val intermediateIofP = List()
    val finalIofP = List()
    val ranking = Map()

    //TODO

  }
}


