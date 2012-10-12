/**
 * 
 */
package me.firecloud.game.rule;

/**
 * @date 2012-10-12
 * 
 */
public abstract class ActorNode
    extends SingleNode
    implements Node {

  /*
   * (non-Javadoc)
   * 
   * @see me.firecloud.game.rule.Node#handle(me.firecloud.game.rule.Event)
   */
  public
      Node handle(Event event,GameContext gameContext) throws RuleException {
    if (checkActor(event,gameContext)) {
      // invoke next node
      return nextNode.handle(event,gameContext);
    } else {
      return null;
    }
  }

  protected abstract
      boolean checkActor(Event event,GameContext gameContext);

}
