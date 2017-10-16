package estuary.components.layers

import breeze.linalg.DenseMatrix
import org.apache.log4j.Logger

/**
  * Created by mengpan on 2017/9/7.
  */
object EmptyLayer extends Layer {

  protected val logger: Logger = Logger.getLogger(this.getClass)
  /** Layer hyperparameters */
  protected val numHiddenUnits = 0
  protected val batchNorm = false

  protected def activationFuncEval(zCurrent: DenseMatrix[Double]): DenseMatrix[Double] =
    throw new Error("EmptyLayer.activationFuncEval")

  protected def activationGradEval(zCurrent: DenseMatrix[Double]): DenseMatrix[Double] =
    throw new Error("EmptyLayer.activationGradEval")

  def copyStructure: Layer = this

  override def setPreviousHiddenUnits(numHiddenUnits: Int): EmptyLayer.type = EmptyLayer

  override def updateNumHiddenUnits(numHiddenUnits: Int) = EmptyLayer
}