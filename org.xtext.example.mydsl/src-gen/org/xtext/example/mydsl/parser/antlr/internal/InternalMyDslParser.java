package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'frame'", "'{'", "'}'", "'container'", "'layout='", "'x'", "'text='", "'=x'", "','", "'textfield'", "'label'", "'button'", "'checkbox'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Domainmodel";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDomainmodel"
    // InternalMyDsl.g:64:1: entryRuleDomainmodel returns [EObject current=null] : iv_ruleDomainmodel= ruleDomainmodel EOF ;
    public final EObject entryRuleDomainmodel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainmodel = null;


        try {
            // InternalMyDsl.g:64:52: (iv_ruleDomainmodel= ruleDomainmodel EOF )
            // InternalMyDsl.g:65:2: iv_ruleDomainmodel= ruleDomainmodel EOF
            {
             newCompositeNode(grammarAccess.getDomainmodelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDomainmodel=ruleDomainmodel();

            state._fsp--;

             current =iv_ruleDomainmodel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDomainmodel"


    // $ANTLR start "ruleDomainmodel"
    // InternalMyDsl.g:71:1: ruleDomainmodel returns [EObject current=null] : ( (lv_elements_0_0= ruleType ) )* ;
    public final EObject ruleDomainmodel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( (lv_elements_0_0= ruleType ) )* )
            // InternalMyDsl.g:78:2: ( (lv_elements_0_0= ruleType ) )*
            {
            // InternalMyDsl.g:78:2: ( (lv_elements_0_0= ruleType ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:79:3: (lv_elements_0_0= ruleType )
            	    {
            	    // InternalMyDsl.g:79:3: (lv_elements_0_0= ruleType )
            	    // InternalMyDsl.g:80:4: lv_elements_0_0= ruleType
            	    {

            	    				newCompositeNode(grammarAccess.getDomainmodelAccess().getElementsTypeParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_elements_0_0=ruleType();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getDomainmodelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"elements",
            	    					lv_elements_0_0,
            	    					"org.xtext.example.mydsl.MyDsl.Type");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDomainmodel"


    // $ANTLR start "entryRuleType"
    // InternalMyDsl.g:100:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalMyDsl.g:100:45: (iv_ruleType= ruleType EOF )
            // InternalMyDsl.g:101:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalMyDsl.g:107:1: ruleType returns [EObject current=null] : (this_Frame_0= ruleFrame | this_Container_1= ruleContainer ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_Frame_0 = null;

        EObject this_Container_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:113:2: ( (this_Frame_0= ruleFrame | this_Container_1= ruleContainer ) )
            // InternalMyDsl.g:114:2: (this_Frame_0= ruleFrame | this_Container_1= ruleContainer )
            {
            // InternalMyDsl.g:114:2: (this_Frame_0= ruleFrame | this_Container_1= ruleContainer )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==14) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:115:3: this_Frame_0= ruleFrame
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getFrameParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Frame_0=ruleFrame();

                    state._fsp--;


                    			current = this_Frame_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:124:3: this_Container_1= ruleContainer
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getContainerParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Container_1=ruleContainer();

                    state._fsp--;


                    			current = this_Container_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleFrame"
    // InternalMyDsl.g:136:1: entryRuleFrame returns [EObject current=null] : iv_ruleFrame= ruleFrame EOF ;
    public final EObject entryRuleFrame() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFrame = null;


        try {
            // InternalMyDsl.g:136:46: (iv_ruleFrame= ruleFrame EOF )
            // InternalMyDsl.g:137:2: iv_ruleFrame= ruleFrame EOF
            {
             newCompositeNode(grammarAccess.getFrameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFrame=ruleFrame();

            state._fsp--;

             current =iv_ruleFrame; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFrame"


    // $ANTLR start "ruleFrame"
    // InternalMyDsl.g:143:1: ruleFrame returns [EObject current=null] : (otherlv_0= 'frame' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_size_3_0= ruleSize ) )? ( (lv_guielements_4_0= ruleGuiElement ) )* otherlv_5= '}' ) ;
    public final EObject ruleFrame() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_size_3_0 = null;

        EObject lv_guielements_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:149:2: ( (otherlv_0= 'frame' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_size_3_0= ruleSize ) )? ( (lv_guielements_4_0= ruleGuiElement ) )* otherlv_5= '}' ) )
            // InternalMyDsl.g:150:2: (otherlv_0= 'frame' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_size_3_0= ruleSize ) )? ( (lv_guielements_4_0= ruleGuiElement ) )* otherlv_5= '}' )
            {
            // InternalMyDsl.g:150:2: (otherlv_0= 'frame' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_size_3_0= ruleSize ) )? ( (lv_guielements_4_0= ruleGuiElement ) )* otherlv_5= '}' )
            // InternalMyDsl.g:151:3: otherlv_0= 'frame' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_size_3_0= ruleSize ) )? ( (lv_guielements_4_0= ruleGuiElement ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getFrameAccess().getFrameKeyword_0());
            		
            // InternalMyDsl.g:155:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:156:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:156:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:157:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFrameAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFrameRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getFrameAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:177:3: ( (lv_size_3_0= ruleSize ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_INT) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:178:4: (lv_size_3_0= ruleSize )
                    {
                    // InternalMyDsl.g:178:4: (lv_size_3_0= ruleSize )
                    // InternalMyDsl.g:179:5: lv_size_3_0= ruleSize
                    {

                    					newCompositeNode(grammarAccess.getFrameAccess().getSizeSizeParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_7);
                    lv_size_3_0=ruleSize();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFrameRule());
                    					}
                    					set(
                    						current,
                    						"size",
                    						lv_size_3_0,
                    						"org.xtext.example.mydsl.MyDsl.Size");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:196:3: ( (lv_guielements_4_0= ruleGuiElement ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID||(LA4_0>=20 && LA4_0<=23)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:197:4: (lv_guielements_4_0= ruleGuiElement )
            	    {
            	    // InternalMyDsl.g:197:4: (lv_guielements_4_0= ruleGuiElement )
            	    // InternalMyDsl.g:198:5: lv_guielements_4_0= ruleGuiElement
            	    {

            	    					newCompositeNode(grammarAccess.getFrameAccess().getGuielementsGuiElementParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_guielements_4_0=ruleGuiElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFrameRule());
            	    					}
            	    					add(
            	    						current,
            	    						"guielements",
            	    						lv_guielements_4_0,
            	    						"org.xtext.example.mydsl.MyDsl.GuiElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getFrameAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFrame"


    // $ANTLR start "entryRuleContainer"
    // InternalMyDsl.g:223:1: entryRuleContainer returns [EObject current=null] : iv_ruleContainer= ruleContainer EOF ;
    public final EObject entryRuleContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainer = null;


        try {
            // InternalMyDsl.g:223:50: (iv_ruleContainer= ruleContainer EOF )
            // InternalMyDsl.g:224:2: iv_ruleContainer= ruleContainer EOF
            {
             newCompositeNode(grammarAccess.getContainerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContainer=ruleContainer();

            state._fsp--;

             current =iv_ruleContainer; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContainer"


    // $ANTLR start "ruleContainer"
    // InternalMyDsl.g:230:1: ruleContainer returns [EObject current=null] : (otherlv_0= 'container' ( (lv_containerName_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_size_3_0= ruleSize ) )? ( (lv_layout_4_0= ruleLayout ) )? ( (lv_guielements_5_0= ruleGuiElement ) )* otherlv_6= '}' ) ;
    public final EObject ruleContainer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_containerName_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_size_3_0 = null;

        EObject lv_layout_4_0 = null;

        EObject lv_guielements_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:236:2: ( (otherlv_0= 'container' ( (lv_containerName_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_size_3_0= ruleSize ) )? ( (lv_layout_4_0= ruleLayout ) )? ( (lv_guielements_5_0= ruleGuiElement ) )* otherlv_6= '}' ) )
            // InternalMyDsl.g:237:2: (otherlv_0= 'container' ( (lv_containerName_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_size_3_0= ruleSize ) )? ( (lv_layout_4_0= ruleLayout ) )? ( (lv_guielements_5_0= ruleGuiElement ) )* otherlv_6= '}' )
            {
            // InternalMyDsl.g:237:2: (otherlv_0= 'container' ( (lv_containerName_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_size_3_0= ruleSize ) )? ( (lv_layout_4_0= ruleLayout ) )? ( (lv_guielements_5_0= ruleGuiElement ) )* otherlv_6= '}' )
            // InternalMyDsl.g:238:3: otherlv_0= 'container' ( (lv_containerName_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_size_3_0= ruleSize ) )? ( (lv_layout_4_0= ruleLayout ) )? ( (lv_guielements_5_0= ruleGuiElement ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getContainerAccess().getContainerKeyword_0());
            		
            // InternalMyDsl.g:242:3: ( (lv_containerName_1_0= RULE_ID ) )
            // InternalMyDsl.g:243:4: (lv_containerName_1_0= RULE_ID )
            {
            // InternalMyDsl.g:243:4: (lv_containerName_1_0= RULE_ID )
            // InternalMyDsl.g:244:5: lv_containerName_1_0= RULE_ID
            {
            lv_containerName_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_containerName_1_0, grammarAccess.getContainerAccess().getContainerNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getContainerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"containerName",
            						lv_containerName_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getContainerAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:264:3: ( (lv_size_3_0= ruleSize ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_INT) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:265:4: (lv_size_3_0= ruleSize )
                    {
                    // InternalMyDsl.g:265:4: (lv_size_3_0= ruleSize )
                    // InternalMyDsl.g:266:5: lv_size_3_0= ruleSize
                    {

                    					newCompositeNode(grammarAccess.getContainerAccess().getSizeSizeParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_9);
                    lv_size_3_0=ruleSize();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getContainerRule());
                    					}
                    					set(
                    						current,
                    						"size",
                    						lv_size_3_0,
                    						"org.xtext.example.mydsl.MyDsl.Size");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:283:3: ( (lv_layout_4_0= ruleLayout ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:284:4: (lv_layout_4_0= ruleLayout )
                    {
                    // InternalMyDsl.g:284:4: (lv_layout_4_0= ruleLayout )
                    // InternalMyDsl.g:285:5: lv_layout_4_0= ruleLayout
                    {

                    					newCompositeNode(grammarAccess.getContainerAccess().getLayoutLayoutParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_7);
                    lv_layout_4_0=ruleLayout();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getContainerRule());
                    					}
                    					set(
                    						current,
                    						"layout",
                    						lv_layout_4_0,
                    						"org.xtext.example.mydsl.MyDsl.Layout");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:302:3: ( (lv_guielements_5_0= ruleGuiElement ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID||(LA7_0>=20 && LA7_0<=23)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:303:4: (lv_guielements_5_0= ruleGuiElement )
            	    {
            	    // InternalMyDsl.g:303:4: (lv_guielements_5_0= ruleGuiElement )
            	    // InternalMyDsl.g:304:5: lv_guielements_5_0= ruleGuiElement
            	    {

            	    					newCompositeNode(grammarAccess.getContainerAccess().getGuielementsGuiElementParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_guielements_5_0=ruleGuiElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getContainerRule());
            	    					}
            	    					add(
            	    						current,
            	    						"guielements",
            	    						lv_guielements_5_0,
            	    						"org.xtext.example.mydsl.MyDsl.GuiElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getContainerAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContainer"


    // $ANTLR start "entryRuleContainerReference"
    // InternalMyDsl.g:329:1: entryRuleContainerReference returns [EObject current=null] : iv_ruleContainerReference= ruleContainerReference EOF ;
    public final EObject entryRuleContainerReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainerReference = null;


        try {
            // InternalMyDsl.g:329:59: (iv_ruleContainerReference= ruleContainerReference EOF )
            // InternalMyDsl.g:330:2: iv_ruleContainerReference= ruleContainerReference EOF
            {
             newCompositeNode(grammarAccess.getContainerReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContainerReference=ruleContainerReference();

            state._fsp--;

             current =iv_ruleContainerReference; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContainerReference"


    // $ANTLR start "ruleContainerReference"
    // InternalMyDsl.g:336:1: ruleContainerReference returns [EObject current=null] : ( ( (lv_referenceName_0_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleContainerReference() throws RecognitionException {
        EObject current = null;

        Token lv_referenceName_0_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:342:2: ( ( ( (lv_referenceName_0_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:343:2: ( ( (lv_referenceName_0_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:343:2: ( ( (lv_referenceName_0_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMyDsl.g:344:3: ( (lv_referenceName_0_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalMyDsl.g:344:3: ( (lv_referenceName_0_0= RULE_ID ) )
            // InternalMyDsl.g:345:4: (lv_referenceName_0_0= RULE_ID )
            {
            // InternalMyDsl.g:345:4: (lv_referenceName_0_0= RULE_ID )
            // InternalMyDsl.g:346:5: lv_referenceName_0_0= RULE_ID
            {
            lv_referenceName_0_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_referenceName_0_0, grammarAccess.getContainerReferenceAccess().getReferenceNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getContainerReferenceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"referenceName",
            						lv_referenceName_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMyDsl.g:362:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:363:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:363:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:364:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getContainerReferenceAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getContainerReferenceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContainerReference"


    // $ANTLR start "entryRuleLayout"
    // InternalMyDsl.g:384:1: entryRuleLayout returns [EObject current=null] : iv_ruleLayout= ruleLayout EOF ;
    public final EObject entryRuleLayout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayout = null;


        try {
            // InternalMyDsl.g:384:47: (iv_ruleLayout= ruleLayout EOF )
            // InternalMyDsl.g:385:2: iv_ruleLayout= ruleLayout EOF
            {
             newCompositeNode(grammarAccess.getLayoutRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLayout=ruleLayout();

            state._fsp--;

             current =iv_ruleLayout; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLayout"


    // $ANTLR start "ruleLayout"
    // InternalMyDsl.g:391:1: ruleLayout returns [EObject current=null] : (otherlv_0= 'layout=' ( (lv_layout_1_0= RULE_ID ) ) ) ;
    public final EObject ruleLayout() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_layout_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:397:2: ( (otherlv_0= 'layout=' ( (lv_layout_1_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:398:2: (otherlv_0= 'layout=' ( (lv_layout_1_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:398:2: (otherlv_0= 'layout=' ( (lv_layout_1_0= RULE_ID ) ) )
            // InternalMyDsl.g:399:3: otherlv_0= 'layout=' ( (lv_layout_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getLayoutAccess().getLayoutKeyword_0());
            		
            // InternalMyDsl.g:403:3: ( (lv_layout_1_0= RULE_ID ) )
            // InternalMyDsl.g:404:4: (lv_layout_1_0= RULE_ID )
            {
            // InternalMyDsl.g:404:4: (lv_layout_1_0= RULE_ID )
            // InternalMyDsl.g:405:5: lv_layout_1_0= RULE_ID
            {
            lv_layout_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_layout_1_0, grammarAccess.getLayoutAccess().getLayoutIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLayoutRule());
            					}
            					setWithLastConsumed(
            						current,
            						"layout",
            						lv_layout_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLayout"


    // $ANTLR start "entryRuleSize"
    // InternalMyDsl.g:425:1: entryRuleSize returns [EObject current=null] : iv_ruleSize= ruleSize EOF ;
    public final EObject entryRuleSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSize = null;


        try {
            // InternalMyDsl.g:425:45: (iv_ruleSize= ruleSize EOF )
            // InternalMyDsl.g:426:2: iv_ruleSize= ruleSize EOF
            {
             newCompositeNode(grammarAccess.getSizeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSize=ruleSize();

            state._fsp--;

             current =iv_ruleSize; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSize"


    // $ANTLR start "ruleSize"
    // InternalMyDsl.g:432:1: ruleSize returns [EObject current=null] : ( ( (lv_width_0_0= RULE_INT ) ) otherlv_1= 'x' ( (lv_height_2_0= RULE_INT ) ) ) ;
    public final EObject ruleSize() throws RecognitionException {
        EObject current = null;

        Token lv_width_0_0=null;
        Token otherlv_1=null;
        Token lv_height_2_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:438:2: ( ( ( (lv_width_0_0= RULE_INT ) ) otherlv_1= 'x' ( (lv_height_2_0= RULE_INT ) ) ) )
            // InternalMyDsl.g:439:2: ( ( (lv_width_0_0= RULE_INT ) ) otherlv_1= 'x' ( (lv_height_2_0= RULE_INT ) ) )
            {
            // InternalMyDsl.g:439:2: ( ( (lv_width_0_0= RULE_INT ) ) otherlv_1= 'x' ( (lv_height_2_0= RULE_INT ) ) )
            // InternalMyDsl.g:440:3: ( (lv_width_0_0= RULE_INT ) ) otherlv_1= 'x' ( (lv_height_2_0= RULE_INT ) )
            {
            // InternalMyDsl.g:440:3: ( (lv_width_0_0= RULE_INT ) )
            // InternalMyDsl.g:441:4: (lv_width_0_0= RULE_INT )
            {
            // InternalMyDsl.g:441:4: (lv_width_0_0= RULE_INT )
            // InternalMyDsl.g:442:5: lv_width_0_0= RULE_INT
            {
            lv_width_0_0=(Token)match(input,RULE_INT,FOLLOW_10); 

            					newLeafNode(lv_width_0_0, grammarAccess.getSizeAccess().getWidthINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSizeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"width",
            						lv_width_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getSizeAccess().getXKeyword_1());
            		
            // InternalMyDsl.g:462:3: ( (lv_height_2_0= RULE_INT ) )
            // InternalMyDsl.g:463:4: (lv_height_2_0= RULE_INT )
            {
            // InternalMyDsl.g:463:4: (lv_height_2_0= RULE_INT )
            // InternalMyDsl.g:464:5: lv_height_2_0= RULE_INT
            {
            lv_height_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_height_2_0, grammarAccess.getSizeAccess().getHeightINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSizeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"height",
            						lv_height_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSize"


    // $ANTLR start "entryRuleText"
    // InternalMyDsl.g:484:1: entryRuleText returns [EObject current=null] : iv_ruleText= ruleText EOF ;
    public final EObject entryRuleText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleText = null;


        try {
            // InternalMyDsl.g:484:45: (iv_ruleText= ruleText EOF )
            // InternalMyDsl.g:485:2: iv_ruleText= ruleText EOF
            {
             newCompositeNode(grammarAccess.getTextRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleText=ruleText();

            state._fsp--;

             current =iv_ruleText; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleText"


    // $ANTLR start "ruleText"
    // InternalMyDsl.g:491:1: ruleText returns [EObject current=null] : (otherlv_0= 'text=' ( (lv_text_1_0= RULE_ID ) ) ) ;
    public final EObject ruleText() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_text_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:497:2: ( (otherlv_0= 'text=' ( (lv_text_1_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:498:2: (otherlv_0= 'text=' ( (lv_text_1_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:498:2: (otherlv_0= 'text=' ( (lv_text_1_0= RULE_ID ) ) )
            // InternalMyDsl.g:499:3: otherlv_0= 'text=' ( (lv_text_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTextAccess().getTextKeyword_0());
            		
            // InternalMyDsl.g:503:3: ( (lv_text_1_0= RULE_ID ) )
            // InternalMyDsl.g:504:4: (lv_text_1_0= RULE_ID )
            {
            // InternalMyDsl.g:504:4: (lv_text_1_0= RULE_ID )
            // InternalMyDsl.g:505:5: lv_text_1_0= RULE_ID
            {
            lv_text_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_text_1_0, grammarAccess.getTextAccess().getTextIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTextRule());
            					}
            					setWithLastConsumed(
            						current,
            						"text",
            						lv_text_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleText"


    // $ANTLR start "entryRuleCheckboxChoice"
    // InternalMyDsl.g:525:1: entryRuleCheckboxChoice returns [EObject current=null] : iv_ruleCheckboxChoice= ruleCheckboxChoice EOF ;
    public final EObject entryRuleCheckboxChoice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheckboxChoice = null;


        try {
            // InternalMyDsl.g:525:55: (iv_ruleCheckboxChoice= ruleCheckboxChoice EOF )
            // InternalMyDsl.g:526:2: iv_ruleCheckboxChoice= ruleCheckboxChoice EOF
            {
             newCompositeNode(grammarAccess.getCheckboxChoiceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCheckboxChoice=ruleCheckboxChoice();

            state._fsp--;

             current =iv_ruleCheckboxChoice; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCheckboxChoice"


    // $ANTLR start "ruleCheckboxChoice"
    // InternalMyDsl.g:532:1: ruleCheckboxChoice returns [EObject current=null] : ( ( (lv_choice_0_0= RULE_ID ) ) (otherlv_1= '=x' )? (otherlv_2= ',' )? ) ;
    public final EObject ruleCheckboxChoice() throws RecognitionException {
        EObject current = null;

        Token lv_choice_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:538:2: ( ( ( (lv_choice_0_0= RULE_ID ) ) (otherlv_1= '=x' )? (otherlv_2= ',' )? ) )
            // InternalMyDsl.g:539:2: ( ( (lv_choice_0_0= RULE_ID ) ) (otherlv_1= '=x' )? (otherlv_2= ',' )? )
            {
            // InternalMyDsl.g:539:2: ( ( (lv_choice_0_0= RULE_ID ) ) (otherlv_1= '=x' )? (otherlv_2= ',' )? )
            // InternalMyDsl.g:540:3: ( (lv_choice_0_0= RULE_ID ) ) (otherlv_1= '=x' )? (otherlv_2= ',' )?
            {
            // InternalMyDsl.g:540:3: ( (lv_choice_0_0= RULE_ID ) )
            // InternalMyDsl.g:541:4: (lv_choice_0_0= RULE_ID )
            {
            // InternalMyDsl.g:541:4: (lv_choice_0_0= RULE_ID )
            // InternalMyDsl.g:542:5: lv_choice_0_0= RULE_ID
            {
            lv_choice_0_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_choice_0_0, grammarAccess.getCheckboxChoiceAccess().getChoiceIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCheckboxChoiceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"choice",
            						lv_choice_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMyDsl.g:558:3: (otherlv_1= '=x' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:559:4: otherlv_1= '=x'
                    {
                    otherlv_1=(Token)match(input,18,FOLLOW_13); 

                    				newLeafNode(otherlv_1, grammarAccess.getCheckboxChoiceAccess().getXKeyword_1());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:564:3: (otherlv_2= ',' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:565:4: otherlv_2= ','
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getCheckboxChoiceAccess().getCommaKeyword_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCheckboxChoice"


    // $ANTLR start "entryRuleGuiElement"
    // InternalMyDsl.g:574:1: entryRuleGuiElement returns [EObject current=null] : iv_ruleGuiElement= ruleGuiElement EOF ;
    public final EObject entryRuleGuiElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGuiElement = null;


        try {
            // InternalMyDsl.g:574:51: (iv_ruleGuiElement= ruleGuiElement EOF )
            // InternalMyDsl.g:575:2: iv_ruleGuiElement= ruleGuiElement EOF
            {
             newCompositeNode(grammarAccess.getGuiElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGuiElement=ruleGuiElement();

            state._fsp--;

             current =iv_ruleGuiElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGuiElement"


    // $ANTLR start "ruleGuiElement"
    // InternalMyDsl.g:581:1: ruleGuiElement returns [EObject current=null] : (this_Textfield_0= ruleTextfield | this_Label_1= ruleLabel | this_Button_2= ruleButton | this_Checkbox_3= ruleCheckbox | this_ContainerReference_4= ruleContainerReference ) ;
    public final EObject ruleGuiElement() throws RecognitionException {
        EObject current = null;

        EObject this_Textfield_0 = null;

        EObject this_Label_1 = null;

        EObject this_Button_2 = null;

        EObject this_Checkbox_3 = null;

        EObject this_ContainerReference_4 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:587:2: ( (this_Textfield_0= ruleTextfield | this_Label_1= ruleLabel | this_Button_2= ruleButton | this_Checkbox_3= ruleCheckbox | this_ContainerReference_4= ruleContainerReference ) )
            // InternalMyDsl.g:588:2: (this_Textfield_0= ruleTextfield | this_Label_1= ruleLabel | this_Button_2= ruleButton | this_Checkbox_3= ruleCheckbox | this_ContainerReference_4= ruleContainerReference )
            {
            // InternalMyDsl.g:588:2: (this_Textfield_0= ruleTextfield | this_Label_1= ruleLabel | this_Button_2= ruleButton | this_Checkbox_3= ruleCheckbox | this_ContainerReference_4= ruleContainerReference )
            int alt10=5;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt10=1;
                }
                break;
            case 21:
                {
                alt10=2;
                }
                break;
            case 22:
                {
                alt10=3;
                }
                break;
            case 23:
                {
                alt10=4;
                }
                break;
            case RULE_ID:
                {
                alt10=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:589:3: this_Textfield_0= ruleTextfield
                    {

                    			newCompositeNode(grammarAccess.getGuiElementAccess().getTextfieldParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Textfield_0=ruleTextfield();

                    state._fsp--;


                    			current = this_Textfield_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:598:3: this_Label_1= ruleLabel
                    {

                    			newCompositeNode(grammarAccess.getGuiElementAccess().getLabelParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Label_1=ruleLabel();

                    state._fsp--;


                    			current = this_Label_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:607:3: this_Button_2= ruleButton
                    {

                    			newCompositeNode(grammarAccess.getGuiElementAccess().getButtonParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Button_2=ruleButton();

                    state._fsp--;


                    			current = this_Button_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:616:3: this_Checkbox_3= ruleCheckbox
                    {

                    			newCompositeNode(grammarAccess.getGuiElementAccess().getCheckboxParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Checkbox_3=ruleCheckbox();

                    state._fsp--;


                    			current = this_Checkbox_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:625:3: this_ContainerReference_4= ruleContainerReference
                    {

                    			newCompositeNode(grammarAccess.getGuiElementAccess().getContainerReferenceParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_ContainerReference_4=ruleContainerReference();

                    state._fsp--;


                    			current = this_ContainerReference_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGuiElement"


    // $ANTLR start "entryRuleTextfield"
    // InternalMyDsl.g:637:1: entryRuleTextfield returns [EObject current=null] : iv_ruleTextfield= ruleTextfield EOF ;
    public final EObject entryRuleTextfield() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextfield = null;


        try {
            // InternalMyDsl.g:637:50: (iv_ruleTextfield= ruleTextfield EOF )
            // InternalMyDsl.g:638:2: iv_ruleTextfield= ruleTextfield EOF
            {
             newCompositeNode(grammarAccess.getTextfieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTextfield=ruleTextfield();

            state._fsp--;

             current =iv_ruleTextfield; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTextfield"


    // $ANTLR start "ruleTextfield"
    // InternalMyDsl.g:644:1: ruleTextfield returns [EObject current=null] : (otherlv_0= 'textfield' ( (lv_name_1_0= RULE_ID ) ) ( (lv_size_2_0= ruleSize ) )? ( (lv_text_3_0= ruleText ) ) ) ;
    public final EObject ruleTextfield() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_size_2_0 = null;

        EObject lv_text_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:650:2: ( (otherlv_0= 'textfield' ( (lv_name_1_0= RULE_ID ) ) ( (lv_size_2_0= ruleSize ) )? ( (lv_text_3_0= ruleText ) ) ) )
            // InternalMyDsl.g:651:2: (otherlv_0= 'textfield' ( (lv_name_1_0= RULE_ID ) ) ( (lv_size_2_0= ruleSize ) )? ( (lv_text_3_0= ruleText ) ) )
            {
            // InternalMyDsl.g:651:2: (otherlv_0= 'textfield' ( (lv_name_1_0= RULE_ID ) ) ( (lv_size_2_0= ruleSize ) )? ( (lv_text_3_0= ruleText ) ) )
            // InternalMyDsl.g:652:3: otherlv_0= 'textfield' ( (lv_name_1_0= RULE_ID ) ) ( (lv_size_2_0= ruleSize ) )? ( (lv_text_3_0= ruleText ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTextfieldAccess().getTextfieldKeyword_0());
            		
            // InternalMyDsl.g:656:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:657:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:657:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:658:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTextfieldAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTextfieldRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMyDsl.g:674:3: ( (lv_size_2_0= ruleSize ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_INT) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:675:4: (lv_size_2_0= ruleSize )
                    {
                    // InternalMyDsl.g:675:4: (lv_size_2_0= ruleSize )
                    // InternalMyDsl.g:676:5: lv_size_2_0= ruleSize
                    {

                    					newCompositeNode(grammarAccess.getTextfieldAccess().getSizeSizeParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_14);
                    lv_size_2_0=ruleSize();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTextfieldRule());
                    					}
                    					set(
                    						current,
                    						"size",
                    						lv_size_2_0,
                    						"org.xtext.example.mydsl.MyDsl.Size");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:693:3: ( (lv_text_3_0= ruleText ) )
            // InternalMyDsl.g:694:4: (lv_text_3_0= ruleText )
            {
            // InternalMyDsl.g:694:4: (lv_text_3_0= ruleText )
            // InternalMyDsl.g:695:5: lv_text_3_0= ruleText
            {

            					newCompositeNode(grammarAccess.getTextfieldAccess().getTextTextParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_text_3_0=ruleText();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTextfieldRule());
            					}
            					set(
            						current,
            						"text",
            						lv_text_3_0,
            						"org.xtext.example.mydsl.MyDsl.Text");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTextfield"


    // $ANTLR start "entryRuleLabel"
    // InternalMyDsl.g:716:1: entryRuleLabel returns [EObject current=null] : iv_ruleLabel= ruleLabel EOF ;
    public final EObject entryRuleLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabel = null;


        try {
            // InternalMyDsl.g:716:46: (iv_ruleLabel= ruleLabel EOF )
            // InternalMyDsl.g:717:2: iv_ruleLabel= ruleLabel EOF
            {
             newCompositeNode(grammarAccess.getLabelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLabel=ruleLabel();

            state._fsp--;

             current =iv_ruleLabel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLabel"


    // $ANTLR start "ruleLabel"
    // InternalMyDsl.g:723:1: ruleLabel returns [EObject current=null] : (otherlv_0= 'label' ( (lv_name_1_0= RULE_ID ) ) ( (lv_size_2_0= ruleSize ) )? ( (lv_text_3_0= ruleText ) ) ) ;
    public final EObject ruleLabel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_size_2_0 = null;

        EObject lv_text_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:729:2: ( (otherlv_0= 'label' ( (lv_name_1_0= RULE_ID ) ) ( (lv_size_2_0= ruleSize ) )? ( (lv_text_3_0= ruleText ) ) ) )
            // InternalMyDsl.g:730:2: (otherlv_0= 'label' ( (lv_name_1_0= RULE_ID ) ) ( (lv_size_2_0= ruleSize ) )? ( (lv_text_3_0= ruleText ) ) )
            {
            // InternalMyDsl.g:730:2: (otherlv_0= 'label' ( (lv_name_1_0= RULE_ID ) ) ( (lv_size_2_0= ruleSize ) )? ( (lv_text_3_0= ruleText ) ) )
            // InternalMyDsl.g:731:3: otherlv_0= 'label' ( (lv_name_1_0= RULE_ID ) ) ( (lv_size_2_0= ruleSize ) )? ( (lv_text_3_0= ruleText ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getLabelAccess().getLabelKeyword_0());
            		
            // InternalMyDsl.g:735:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:736:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:736:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:737:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLabelAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLabelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMyDsl.g:753:3: ( (lv_size_2_0= ruleSize ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_INT) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:754:4: (lv_size_2_0= ruleSize )
                    {
                    // InternalMyDsl.g:754:4: (lv_size_2_0= ruleSize )
                    // InternalMyDsl.g:755:5: lv_size_2_0= ruleSize
                    {

                    					newCompositeNode(grammarAccess.getLabelAccess().getSizeSizeParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_14);
                    lv_size_2_0=ruleSize();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLabelRule());
                    					}
                    					set(
                    						current,
                    						"size",
                    						lv_size_2_0,
                    						"org.xtext.example.mydsl.MyDsl.Size");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:772:3: ( (lv_text_3_0= ruleText ) )
            // InternalMyDsl.g:773:4: (lv_text_3_0= ruleText )
            {
            // InternalMyDsl.g:773:4: (lv_text_3_0= ruleText )
            // InternalMyDsl.g:774:5: lv_text_3_0= ruleText
            {

            					newCompositeNode(grammarAccess.getLabelAccess().getTextTextParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_text_3_0=ruleText();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLabelRule());
            					}
            					set(
            						current,
            						"text",
            						lv_text_3_0,
            						"org.xtext.example.mydsl.MyDsl.Text");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLabel"


    // $ANTLR start "entryRuleButton"
    // InternalMyDsl.g:795:1: entryRuleButton returns [EObject current=null] : iv_ruleButton= ruleButton EOF ;
    public final EObject entryRuleButton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleButton = null;


        try {
            // InternalMyDsl.g:795:47: (iv_ruleButton= ruleButton EOF )
            // InternalMyDsl.g:796:2: iv_ruleButton= ruleButton EOF
            {
             newCompositeNode(grammarAccess.getButtonRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleButton=ruleButton();

            state._fsp--;

             current =iv_ruleButton; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleButton"


    // $ANTLR start "ruleButton"
    // InternalMyDsl.g:802:1: ruleButton returns [EObject current=null] : (otherlv_0= 'button' ( (lv_name_1_0= RULE_ID ) ) ( (lv_size_2_0= ruleSize ) )? ( (lv_text_3_0= ruleText ) ) ) ;
    public final EObject ruleButton() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_size_2_0 = null;

        EObject lv_text_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:808:2: ( (otherlv_0= 'button' ( (lv_name_1_0= RULE_ID ) ) ( (lv_size_2_0= ruleSize ) )? ( (lv_text_3_0= ruleText ) ) ) )
            // InternalMyDsl.g:809:2: (otherlv_0= 'button' ( (lv_name_1_0= RULE_ID ) ) ( (lv_size_2_0= ruleSize ) )? ( (lv_text_3_0= ruleText ) ) )
            {
            // InternalMyDsl.g:809:2: (otherlv_0= 'button' ( (lv_name_1_0= RULE_ID ) ) ( (lv_size_2_0= ruleSize ) )? ( (lv_text_3_0= ruleText ) ) )
            // InternalMyDsl.g:810:3: otherlv_0= 'button' ( (lv_name_1_0= RULE_ID ) ) ( (lv_size_2_0= ruleSize ) )? ( (lv_text_3_0= ruleText ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getButtonAccess().getButtonKeyword_0());
            		
            // InternalMyDsl.g:814:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:815:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:815:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:816:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_1_0, grammarAccess.getButtonAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getButtonRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMyDsl.g:832:3: ( (lv_size_2_0= ruleSize ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_INT) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:833:4: (lv_size_2_0= ruleSize )
                    {
                    // InternalMyDsl.g:833:4: (lv_size_2_0= ruleSize )
                    // InternalMyDsl.g:834:5: lv_size_2_0= ruleSize
                    {

                    					newCompositeNode(grammarAccess.getButtonAccess().getSizeSizeParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_14);
                    lv_size_2_0=ruleSize();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getButtonRule());
                    					}
                    					set(
                    						current,
                    						"size",
                    						lv_size_2_0,
                    						"org.xtext.example.mydsl.MyDsl.Size");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:851:3: ( (lv_text_3_0= ruleText ) )
            // InternalMyDsl.g:852:4: (lv_text_3_0= ruleText )
            {
            // InternalMyDsl.g:852:4: (lv_text_3_0= ruleText )
            // InternalMyDsl.g:853:5: lv_text_3_0= ruleText
            {

            					newCompositeNode(grammarAccess.getButtonAccess().getTextTextParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_text_3_0=ruleText();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getButtonRule());
            					}
            					set(
            						current,
            						"text",
            						lv_text_3_0,
            						"org.xtext.example.mydsl.MyDsl.Text");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleButton"


    // $ANTLR start "entryRuleCheckbox"
    // InternalMyDsl.g:874:1: entryRuleCheckbox returns [EObject current=null] : iv_ruleCheckbox= ruleCheckbox EOF ;
    public final EObject entryRuleCheckbox() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheckbox = null;


        try {
            // InternalMyDsl.g:874:49: (iv_ruleCheckbox= ruleCheckbox EOF )
            // InternalMyDsl.g:875:2: iv_ruleCheckbox= ruleCheckbox EOF
            {
             newCompositeNode(grammarAccess.getCheckboxRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCheckbox=ruleCheckbox();

            state._fsp--;

             current =iv_ruleCheckbox; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCheckbox"


    // $ANTLR start "ruleCheckbox"
    // InternalMyDsl.g:881:1: ruleCheckbox returns [EObject current=null] : (otherlv_0= 'checkbox' ( (lv_name_1_0= RULE_ID ) ) ( (lv_size_2_0= ruleSize ) )? ( (lv_choice_3_0= ruleCheckboxChoice ) ) ) ;
    public final EObject ruleCheckbox() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_size_2_0 = null;

        EObject lv_choice_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:887:2: ( (otherlv_0= 'checkbox' ( (lv_name_1_0= RULE_ID ) ) ( (lv_size_2_0= ruleSize ) )? ( (lv_choice_3_0= ruleCheckboxChoice ) ) ) )
            // InternalMyDsl.g:888:2: (otherlv_0= 'checkbox' ( (lv_name_1_0= RULE_ID ) ) ( (lv_size_2_0= ruleSize ) )? ( (lv_choice_3_0= ruleCheckboxChoice ) ) )
            {
            // InternalMyDsl.g:888:2: (otherlv_0= 'checkbox' ( (lv_name_1_0= RULE_ID ) ) ( (lv_size_2_0= ruleSize ) )? ( (lv_choice_3_0= ruleCheckboxChoice ) ) )
            // InternalMyDsl.g:889:3: otherlv_0= 'checkbox' ( (lv_name_1_0= RULE_ID ) ) ( (lv_size_2_0= ruleSize ) )? ( (lv_choice_3_0= ruleCheckboxChoice ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCheckboxAccess().getCheckboxKeyword_0());
            		
            // InternalMyDsl.g:893:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:894:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:894:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:895:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_name_1_0, grammarAccess.getCheckboxAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCheckboxRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMyDsl.g:911:3: ( (lv_size_2_0= ruleSize ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_INT) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:912:4: (lv_size_2_0= ruleSize )
                    {
                    // InternalMyDsl.g:912:4: (lv_size_2_0= ruleSize )
                    // InternalMyDsl.g:913:5: lv_size_2_0= ruleSize
                    {

                    					newCompositeNode(grammarAccess.getCheckboxAccess().getSizeSizeParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_15);
                    lv_size_2_0=ruleSize();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getCheckboxRule());
                    					}
                    					set(
                    						current,
                    						"size",
                    						lv_size_2_0,
                    						"org.xtext.example.mydsl.MyDsl.Size");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:930:3: ( (lv_choice_3_0= ruleCheckboxChoice ) )
            // InternalMyDsl.g:931:4: (lv_choice_3_0= ruleCheckboxChoice )
            {
            // InternalMyDsl.g:931:4: (lv_choice_3_0= ruleCheckboxChoice )
            // InternalMyDsl.g:932:5: lv_choice_3_0= ruleCheckboxChoice
            {

            					newCompositeNode(grammarAccess.getCheckboxAccess().getChoiceCheckboxChoiceParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_choice_3_0=ruleCheckboxChoice();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCheckboxRule());
            					}
            					set(
            						current,
            						"choice",
            						lv_choice_3_0,
            						"org.xtext.example.mydsl.MyDsl.CheckboxChoice");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCheckbox"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000F02030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000F02010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000F0A030L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000F0A010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000020020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000030L});

}