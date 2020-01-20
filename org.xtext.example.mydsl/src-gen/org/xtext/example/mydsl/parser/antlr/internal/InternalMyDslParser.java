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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'main='", "'frame'", "'container'", "'horizontal'", "'{'", "'}'", "'vertical'", "'positional'", "'['", "']'", "'space'", "','", "'textfield'", "'label'", "'button'", "'checkbox'", "'radio'", "'X'", "'O'"
    };
    public static final int RULE_STRING=5;
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
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
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
    // InternalMyDsl.g:71:1: ruleDomainmodel returns [EObject current=null] : (otherlv_0= 'main=' ( (lv_main_1_0= ruleNAME ) ) ( (lv_elements_2_0= ruleType ) )* ) ;
    public final EObject ruleDomainmodel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_main_1_0 = null;

        EObject lv_elements_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( (otherlv_0= 'main=' ( (lv_main_1_0= ruleNAME ) ) ( (lv_elements_2_0= ruleType ) )* ) )
            // InternalMyDsl.g:78:2: (otherlv_0= 'main=' ( (lv_main_1_0= ruleNAME ) ) ( (lv_elements_2_0= ruleType ) )* )
            {
            // InternalMyDsl.g:78:2: (otherlv_0= 'main=' ( (lv_main_1_0= ruleNAME ) ) ( (lv_elements_2_0= ruleType ) )* )
            // InternalMyDsl.g:79:3: otherlv_0= 'main=' ( (lv_main_1_0= ruleNAME ) ) ( (lv_elements_2_0= ruleType ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDomainmodelAccess().getMainKeyword_0());
            		
            // InternalMyDsl.g:83:3: ( (lv_main_1_0= ruleNAME ) )
            // InternalMyDsl.g:84:4: (lv_main_1_0= ruleNAME )
            {
            // InternalMyDsl.g:84:4: (lv_main_1_0= ruleNAME )
            // InternalMyDsl.g:85:5: lv_main_1_0= ruleNAME
            {

            					newCompositeNode(grammarAccess.getDomainmodelAccess().getMainNAMEParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_main_1_0=ruleNAME();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDomainmodelRule());
            					}
            					set(
            						current,
            						"main",
            						lv_main_1_0,
            						"org.xtext.example.mydsl.MyDsl.NAME");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:102:3: ( (lv_elements_2_0= ruleType ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=12 && LA1_0<=13)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:103:4: (lv_elements_2_0= ruleType )
            	    {
            	    // InternalMyDsl.g:103:4: (lv_elements_2_0= ruleType )
            	    // InternalMyDsl.g:104:5: lv_elements_2_0= ruleType
            	    {

            	    					newCompositeNode(grammarAccess.getDomainmodelAccess().getElementsTypeParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_elements_2_0=ruleType();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDomainmodelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_2_0,
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
    // InternalMyDsl.g:125:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalMyDsl.g:125:45: (iv_ruleType= ruleType EOF )
            // InternalMyDsl.g:126:2: iv_ruleType= ruleType EOF
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
    // InternalMyDsl.g:132:1: ruleType returns [EObject current=null] : (this_Frame_0= ruleFrame | this_Container_1= ruleContainer ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_Frame_0 = null;

        EObject this_Container_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:138:2: ( (this_Frame_0= ruleFrame | this_Container_1= ruleContainer ) )
            // InternalMyDsl.g:139:2: (this_Frame_0= ruleFrame | this_Container_1= ruleContainer )
            {
            // InternalMyDsl.g:139:2: (this_Frame_0= ruleFrame | this_Container_1= ruleContainer )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            else if ( (LA2_0==13) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:140:3: this_Frame_0= ruleFrame
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
                    // InternalMyDsl.g:149:3: this_Container_1= ruleContainer
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
    // InternalMyDsl.g:161:1: entryRuleFrame returns [EObject current=null] : iv_ruleFrame= ruleFrame EOF ;
    public final EObject entryRuleFrame() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFrame = null;


        try {
            // InternalMyDsl.g:161:46: (iv_ruleFrame= ruleFrame EOF )
            // InternalMyDsl.g:162:2: iv_ruleFrame= ruleFrame EOF
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
    // InternalMyDsl.g:168:1: ruleFrame returns [EObject current=null] : (otherlv_0= 'frame' ( (lv_name_1_0= ruleNAME ) ) ( (lv_size_2_0= ruleSize ) )? ( (lv_layout_3_0= ruleLayout ) )? ) ;
    public final EObject ruleFrame() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_size_2_0 = null;

        EObject lv_layout_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:174:2: ( (otherlv_0= 'frame' ( (lv_name_1_0= ruleNAME ) ) ( (lv_size_2_0= ruleSize ) )? ( (lv_layout_3_0= ruleLayout ) )? ) )
            // InternalMyDsl.g:175:2: (otherlv_0= 'frame' ( (lv_name_1_0= ruleNAME ) ) ( (lv_size_2_0= ruleSize ) )? ( (lv_layout_3_0= ruleLayout ) )? )
            {
            // InternalMyDsl.g:175:2: (otherlv_0= 'frame' ( (lv_name_1_0= ruleNAME ) ) ( (lv_size_2_0= ruleSize ) )? ( (lv_layout_3_0= ruleLayout ) )? )
            // InternalMyDsl.g:176:3: otherlv_0= 'frame' ( (lv_name_1_0= ruleNAME ) ) ( (lv_size_2_0= ruleSize ) )? ( (lv_layout_3_0= ruleLayout ) )?
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getFrameAccess().getFrameKeyword_0());
            		
            // InternalMyDsl.g:180:3: ( (lv_name_1_0= ruleNAME ) )
            // InternalMyDsl.g:181:4: (lv_name_1_0= ruleNAME )
            {
            // InternalMyDsl.g:181:4: (lv_name_1_0= ruleNAME )
            // InternalMyDsl.g:182:5: lv_name_1_0= ruleNAME
            {

            					newCompositeNode(grammarAccess.getFrameAccess().getNameNAMEParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_1_0=ruleNAME();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFrameRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyDsl.NAME");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:199:3: ( (lv_size_2_0= ruleSize ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_INT) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:200:4: (lv_size_2_0= ruleSize )
                    {
                    // InternalMyDsl.g:200:4: (lv_size_2_0= ruleSize )
                    // InternalMyDsl.g:201:5: lv_size_2_0= ruleSize
                    {

                    					newCompositeNode(grammarAccess.getFrameAccess().getSizeSizeParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_6);
                    lv_size_2_0=ruleSize();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFrameRule());
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

            // InternalMyDsl.g:218:3: ( (lv_layout_3_0= ruleLayout ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14||(LA4_0>=17 && LA4_0<=18)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:219:4: (lv_layout_3_0= ruleLayout )
                    {
                    // InternalMyDsl.g:219:4: (lv_layout_3_0= ruleLayout )
                    // InternalMyDsl.g:220:5: lv_layout_3_0= ruleLayout
                    {

                    					newCompositeNode(grammarAccess.getFrameAccess().getLayoutLayoutParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_layout_3_0=ruleLayout();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFrameRule());
                    					}
                    					set(
                    						current,
                    						"layout",
                    						lv_layout_3_0,
                    						"org.xtext.example.mydsl.MyDsl.Layout");
                    					afterParserOrEnumRuleCall();
                    				

                    }


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
    // $ANTLR end "ruleFrame"


    // $ANTLR start "entryRuleContainer"
    // InternalMyDsl.g:241:1: entryRuleContainer returns [EObject current=null] : iv_ruleContainer= ruleContainer EOF ;
    public final EObject entryRuleContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainer = null;


        try {
            // InternalMyDsl.g:241:50: (iv_ruleContainer= ruleContainer EOF )
            // InternalMyDsl.g:242:2: iv_ruleContainer= ruleContainer EOF
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
    // InternalMyDsl.g:248:1: ruleContainer returns [EObject current=null] : (otherlv_0= 'container' ( (lv_name_1_0= ruleNAME ) ) ( (lv_size_2_0= ruleSize ) )? ( (lv_layout_3_0= ruleLayout ) ) ) ;
    public final EObject ruleContainer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_size_2_0 = null;

        EObject lv_layout_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:254:2: ( (otherlv_0= 'container' ( (lv_name_1_0= ruleNAME ) ) ( (lv_size_2_0= ruleSize ) )? ( (lv_layout_3_0= ruleLayout ) ) ) )
            // InternalMyDsl.g:255:2: (otherlv_0= 'container' ( (lv_name_1_0= ruleNAME ) ) ( (lv_size_2_0= ruleSize ) )? ( (lv_layout_3_0= ruleLayout ) ) )
            {
            // InternalMyDsl.g:255:2: (otherlv_0= 'container' ( (lv_name_1_0= ruleNAME ) ) ( (lv_size_2_0= ruleSize ) )? ( (lv_layout_3_0= ruleLayout ) ) )
            // InternalMyDsl.g:256:3: otherlv_0= 'container' ( (lv_name_1_0= ruleNAME ) ) ( (lv_size_2_0= ruleSize ) )? ( (lv_layout_3_0= ruleLayout ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getContainerAccess().getContainerKeyword_0());
            		
            // InternalMyDsl.g:260:3: ( (lv_name_1_0= ruleNAME ) )
            // InternalMyDsl.g:261:4: (lv_name_1_0= ruleNAME )
            {
            // InternalMyDsl.g:261:4: (lv_name_1_0= ruleNAME )
            // InternalMyDsl.g:262:5: lv_name_1_0= ruleNAME
            {

            					newCompositeNode(grammarAccess.getContainerAccess().getNameNAMEParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
            lv_name_1_0=ruleNAME();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContainerRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyDsl.NAME");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:279:3: ( (lv_size_2_0= ruleSize ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_INT) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:280:4: (lv_size_2_0= ruleSize )
                    {
                    // InternalMyDsl.g:280:4: (lv_size_2_0= ruleSize )
                    // InternalMyDsl.g:281:5: lv_size_2_0= ruleSize
                    {

                    					newCompositeNode(grammarAccess.getContainerAccess().getSizeSizeParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_8);
                    lv_size_2_0=ruleSize();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getContainerRule());
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

            // InternalMyDsl.g:298:3: ( (lv_layout_3_0= ruleLayout ) )
            // InternalMyDsl.g:299:4: (lv_layout_3_0= ruleLayout )
            {
            // InternalMyDsl.g:299:4: (lv_layout_3_0= ruleLayout )
            // InternalMyDsl.g:300:5: lv_layout_3_0= ruleLayout
            {

            					newCompositeNode(grammarAccess.getContainerAccess().getLayoutLayoutParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_layout_3_0=ruleLayout();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContainerRule());
            					}
            					set(
            						current,
            						"layout",
            						lv_layout_3_0,
            						"org.xtext.example.mydsl.MyDsl.Layout");
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
    // $ANTLR end "ruleContainer"


    // $ANTLR start "entryRuleLayout"
    // InternalMyDsl.g:321:1: entryRuleLayout returns [EObject current=null] : iv_ruleLayout= ruleLayout EOF ;
    public final EObject entryRuleLayout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayout = null;


        try {
            // InternalMyDsl.g:321:47: (iv_ruleLayout= ruleLayout EOF )
            // InternalMyDsl.g:322:2: iv_ruleLayout= ruleLayout EOF
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
    // InternalMyDsl.g:328:1: ruleLayout returns [EObject current=null] : (this_LayoutHorizontal_0= ruleLayoutHorizontal | this_LayoutVertical_1= ruleLayoutVertical | this_LayoutPosition_2= ruleLayoutPosition ) ;
    public final EObject ruleLayout() throws RecognitionException {
        EObject current = null;

        EObject this_LayoutHorizontal_0 = null;

        EObject this_LayoutVertical_1 = null;

        EObject this_LayoutPosition_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:334:2: ( (this_LayoutHorizontal_0= ruleLayoutHorizontal | this_LayoutVertical_1= ruleLayoutVertical | this_LayoutPosition_2= ruleLayoutPosition ) )
            // InternalMyDsl.g:335:2: (this_LayoutHorizontal_0= ruleLayoutHorizontal | this_LayoutVertical_1= ruleLayoutVertical | this_LayoutPosition_2= ruleLayoutPosition )
            {
            // InternalMyDsl.g:335:2: (this_LayoutHorizontal_0= ruleLayoutHorizontal | this_LayoutVertical_1= ruleLayoutVertical | this_LayoutPosition_2= ruleLayoutPosition )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt6=1;
                }
                break;
            case 17:
                {
                alt6=2;
                }
                break;
            case 18:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:336:3: this_LayoutHorizontal_0= ruleLayoutHorizontal
                    {

                    			newCompositeNode(grammarAccess.getLayoutAccess().getLayoutHorizontalParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_LayoutHorizontal_0=ruleLayoutHorizontal();

                    state._fsp--;


                    			current = this_LayoutHorizontal_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:345:3: this_LayoutVertical_1= ruleLayoutVertical
                    {

                    			newCompositeNode(grammarAccess.getLayoutAccess().getLayoutVerticalParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_LayoutVertical_1=ruleLayoutVertical();

                    state._fsp--;


                    			current = this_LayoutVertical_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:354:3: this_LayoutPosition_2= ruleLayoutPosition
                    {

                    			newCompositeNode(grammarAccess.getLayoutAccess().getLayoutPositionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_LayoutPosition_2=ruleLayoutPosition();

                    state._fsp--;


                    			current = this_LayoutPosition_2;
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
    // $ANTLR end "ruleLayout"


    // $ANTLR start "entryRuleLayoutHorizontal"
    // InternalMyDsl.g:366:1: entryRuleLayoutHorizontal returns [EObject current=null] : iv_ruleLayoutHorizontal= ruleLayoutHorizontal EOF ;
    public final EObject entryRuleLayoutHorizontal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayoutHorizontal = null;


        try {
            // InternalMyDsl.g:366:57: (iv_ruleLayoutHorizontal= ruleLayoutHorizontal EOF )
            // InternalMyDsl.g:367:2: iv_ruleLayoutHorizontal= ruleLayoutHorizontal EOF
            {
             newCompositeNode(grammarAccess.getLayoutHorizontalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLayoutHorizontal=ruleLayoutHorizontal();

            state._fsp--;

             current =iv_ruleLayoutHorizontal; 
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
    // $ANTLR end "entryRuleLayoutHorizontal"


    // $ANTLR start "ruleLayoutHorizontal"
    // InternalMyDsl.g:373:1: ruleLayoutHorizontal returns [EObject current=null] : (otherlv_0= 'horizontal' otherlv_1= '{' ( (lv_entries_2_0= ruleLayoutHorizontalEntry ) )* otherlv_3= '}' ) ;
    public final EObject ruleLayoutHorizontal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_entries_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:379:2: ( (otherlv_0= 'horizontal' otherlv_1= '{' ( (lv_entries_2_0= ruleLayoutHorizontalEntry ) )* otherlv_3= '}' ) )
            // InternalMyDsl.g:380:2: (otherlv_0= 'horizontal' otherlv_1= '{' ( (lv_entries_2_0= ruleLayoutHorizontalEntry ) )* otherlv_3= '}' )
            {
            // InternalMyDsl.g:380:2: (otherlv_0= 'horizontal' otherlv_1= '{' ( (lv_entries_2_0= ruleLayoutHorizontalEntry ) )* otherlv_3= '}' )
            // InternalMyDsl.g:381:3: otherlv_0= 'horizontal' otherlv_1= '{' ( (lv_entries_2_0= ruleLayoutHorizontalEntry ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getLayoutHorizontalAccess().getHorizontalKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getLayoutHorizontalAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMyDsl.g:389:3: ( (lv_entries_2_0= ruleLayoutHorizontalEntry ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID||LA7_0==14||(LA7_0>=17 && LA7_0<=18)||LA7_0==21||(LA7_0>=23 && LA7_0<=27)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:390:4: (lv_entries_2_0= ruleLayoutHorizontalEntry )
            	    {
            	    // InternalMyDsl.g:390:4: (lv_entries_2_0= ruleLayoutHorizontalEntry )
            	    // InternalMyDsl.g:391:5: lv_entries_2_0= ruleLayoutHorizontalEntry
            	    {

            	    					newCompositeNode(grammarAccess.getLayoutHorizontalAccess().getEntriesLayoutHorizontalEntryParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_entries_2_0=ruleLayoutHorizontalEntry();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLayoutHorizontalRule());
            	    					}
            	    					add(
            	    						current,
            	    						"entries",
            	    						lv_entries_2_0,
            	    						"org.xtext.example.mydsl.MyDsl.LayoutHorizontalEntry");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_3=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getLayoutHorizontalAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleLayoutHorizontal"


    // $ANTLR start "entryRuleLayoutHorizontalEntry"
    // InternalMyDsl.g:416:1: entryRuleLayoutHorizontalEntry returns [EObject current=null] : iv_ruleLayoutHorizontalEntry= ruleLayoutHorizontalEntry EOF ;
    public final EObject entryRuleLayoutHorizontalEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayoutHorizontalEntry = null;


        try {
            // InternalMyDsl.g:416:62: (iv_ruleLayoutHorizontalEntry= ruleLayoutHorizontalEntry EOF )
            // InternalMyDsl.g:417:2: iv_ruleLayoutHorizontalEntry= ruleLayoutHorizontalEntry EOF
            {
             newCompositeNode(grammarAccess.getLayoutHorizontalEntryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLayoutHorizontalEntry=ruleLayoutHorizontalEntry();

            state._fsp--;

             current =iv_ruleLayoutHorizontalEntry; 
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
    // $ANTLR end "entryRuleLayoutHorizontalEntry"


    // $ANTLR start "ruleLayoutHorizontalEntry"
    // InternalMyDsl.g:423:1: ruleLayoutHorizontalEntry returns [EObject current=null] : ( ( (lv_space_0_0= ruleSpace ) ) | ( (lv_guielement_1_0= ruleGuiElement ) ) ) ;
    public final EObject ruleLayoutHorizontalEntry() throws RecognitionException {
        EObject current = null;

        EObject lv_space_0_0 = null;

        EObject lv_guielement_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:429:2: ( ( ( (lv_space_0_0= ruleSpace ) ) | ( (lv_guielement_1_0= ruleGuiElement ) ) ) )
            // InternalMyDsl.g:430:2: ( ( (lv_space_0_0= ruleSpace ) ) | ( (lv_guielement_1_0= ruleGuiElement ) ) )
            {
            // InternalMyDsl.g:430:2: ( ( (lv_space_0_0= ruleSpace ) ) | ( (lv_guielement_1_0= ruleGuiElement ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID||LA8_0==14||(LA8_0>=17 && LA8_0<=18)||(LA8_0>=23 && LA8_0<=27)) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:431:3: ( (lv_space_0_0= ruleSpace ) )
                    {
                    // InternalMyDsl.g:431:3: ( (lv_space_0_0= ruleSpace ) )
                    // InternalMyDsl.g:432:4: (lv_space_0_0= ruleSpace )
                    {
                    // InternalMyDsl.g:432:4: (lv_space_0_0= ruleSpace )
                    // InternalMyDsl.g:433:5: lv_space_0_0= ruleSpace
                    {

                    					newCompositeNode(grammarAccess.getLayoutHorizontalEntryAccess().getSpaceSpaceParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_space_0_0=ruleSpace();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLayoutHorizontalEntryRule());
                    					}
                    					set(
                    						current,
                    						"space",
                    						lv_space_0_0,
                    						"org.xtext.example.mydsl.MyDsl.Space");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:451:3: ( (lv_guielement_1_0= ruleGuiElement ) )
                    {
                    // InternalMyDsl.g:451:3: ( (lv_guielement_1_0= ruleGuiElement ) )
                    // InternalMyDsl.g:452:4: (lv_guielement_1_0= ruleGuiElement )
                    {
                    // InternalMyDsl.g:452:4: (lv_guielement_1_0= ruleGuiElement )
                    // InternalMyDsl.g:453:5: lv_guielement_1_0= ruleGuiElement
                    {

                    					newCompositeNode(grammarAccess.getLayoutHorizontalEntryAccess().getGuielementGuiElementParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_guielement_1_0=ruleGuiElement();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLayoutHorizontalEntryRule());
                    					}
                    					set(
                    						current,
                    						"guielement",
                    						lv_guielement_1_0,
                    						"org.xtext.example.mydsl.MyDsl.GuiElement");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


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
    // $ANTLR end "ruleLayoutHorizontalEntry"


    // $ANTLR start "entryRuleLayoutVertical"
    // InternalMyDsl.g:474:1: entryRuleLayoutVertical returns [EObject current=null] : iv_ruleLayoutVertical= ruleLayoutVertical EOF ;
    public final EObject entryRuleLayoutVertical() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayoutVertical = null;


        try {
            // InternalMyDsl.g:474:55: (iv_ruleLayoutVertical= ruleLayoutVertical EOF )
            // InternalMyDsl.g:475:2: iv_ruleLayoutVertical= ruleLayoutVertical EOF
            {
             newCompositeNode(grammarAccess.getLayoutVerticalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLayoutVertical=ruleLayoutVertical();

            state._fsp--;

             current =iv_ruleLayoutVertical; 
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
    // $ANTLR end "entryRuleLayoutVertical"


    // $ANTLR start "ruleLayoutVertical"
    // InternalMyDsl.g:481:1: ruleLayoutVertical returns [EObject current=null] : (otherlv_0= 'vertical' otherlv_1= '{' ( (lv_entries_2_0= ruleLayoutVerticalEntry ) )* otherlv_3= '}' ) ;
    public final EObject ruleLayoutVertical() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_entries_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:487:2: ( (otherlv_0= 'vertical' otherlv_1= '{' ( (lv_entries_2_0= ruleLayoutVerticalEntry ) )* otherlv_3= '}' ) )
            // InternalMyDsl.g:488:2: (otherlv_0= 'vertical' otherlv_1= '{' ( (lv_entries_2_0= ruleLayoutVerticalEntry ) )* otherlv_3= '}' )
            {
            // InternalMyDsl.g:488:2: (otherlv_0= 'vertical' otherlv_1= '{' ( (lv_entries_2_0= ruleLayoutVerticalEntry ) )* otherlv_3= '}' )
            // InternalMyDsl.g:489:3: otherlv_0= 'vertical' otherlv_1= '{' ( (lv_entries_2_0= ruleLayoutVerticalEntry ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getLayoutVerticalAccess().getVerticalKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getLayoutVerticalAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMyDsl.g:497:3: ( (lv_entries_2_0= ruleLayoutVerticalEntry ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID||LA9_0==14||(LA9_0>=17 && LA9_0<=18)||LA9_0==21||(LA9_0>=23 && LA9_0<=27)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:498:4: (lv_entries_2_0= ruleLayoutVerticalEntry )
            	    {
            	    // InternalMyDsl.g:498:4: (lv_entries_2_0= ruleLayoutVerticalEntry )
            	    // InternalMyDsl.g:499:5: lv_entries_2_0= ruleLayoutVerticalEntry
            	    {

            	    					newCompositeNode(grammarAccess.getLayoutVerticalAccess().getEntriesLayoutVerticalEntryParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_entries_2_0=ruleLayoutVerticalEntry();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLayoutVerticalRule());
            	    					}
            	    					add(
            	    						current,
            	    						"entries",
            	    						lv_entries_2_0,
            	    						"org.xtext.example.mydsl.MyDsl.LayoutVerticalEntry");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_3=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getLayoutVerticalAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleLayoutVertical"


    // $ANTLR start "entryRuleLayoutVerticalEntry"
    // InternalMyDsl.g:524:1: entryRuleLayoutVerticalEntry returns [EObject current=null] : iv_ruleLayoutVerticalEntry= ruleLayoutVerticalEntry EOF ;
    public final EObject entryRuleLayoutVerticalEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayoutVerticalEntry = null;


        try {
            // InternalMyDsl.g:524:60: (iv_ruleLayoutVerticalEntry= ruleLayoutVerticalEntry EOF )
            // InternalMyDsl.g:525:2: iv_ruleLayoutVerticalEntry= ruleLayoutVerticalEntry EOF
            {
             newCompositeNode(grammarAccess.getLayoutVerticalEntryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLayoutVerticalEntry=ruleLayoutVerticalEntry();

            state._fsp--;

             current =iv_ruleLayoutVerticalEntry; 
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
    // $ANTLR end "entryRuleLayoutVerticalEntry"


    // $ANTLR start "ruleLayoutVerticalEntry"
    // InternalMyDsl.g:531:1: ruleLayoutVerticalEntry returns [EObject current=null] : ( ( (lv_space_0_0= ruleSpace ) ) | ( (lv_guielement_1_0= ruleGuiElement ) ) ) ;
    public final EObject ruleLayoutVerticalEntry() throws RecognitionException {
        EObject current = null;

        EObject lv_space_0_0 = null;

        EObject lv_guielement_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:537:2: ( ( ( (lv_space_0_0= ruleSpace ) ) | ( (lv_guielement_1_0= ruleGuiElement ) ) ) )
            // InternalMyDsl.g:538:2: ( ( (lv_space_0_0= ruleSpace ) ) | ( (lv_guielement_1_0= ruleGuiElement ) ) )
            {
            // InternalMyDsl.g:538:2: ( ( (lv_space_0_0= ruleSpace ) ) | ( (lv_guielement_1_0= ruleGuiElement ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_ID||LA10_0==14||(LA10_0>=17 && LA10_0<=18)||(LA10_0>=23 && LA10_0<=27)) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:539:3: ( (lv_space_0_0= ruleSpace ) )
                    {
                    // InternalMyDsl.g:539:3: ( (lv_space_0_0= ruleSpace ) )
                    // InternalMyDsl.g:540:4: (lv_space_0_0= ruleSpace )
                    {
                    // InternalMyDsl.g:540:4: (lv_space_0_0= ruleSpace )
                    // InternalMyDsl.g:541:5: lv_space_0_0= ruleSpace
                    {

                    					newCompositeNode(grammarAccess.getLayoutVerticalEntryAccess().getSpaceSpaceParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_space_0_0=ruleSpace();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLayoutVerticalEntryRule());
                    					}
                    					set(
                    						current,
                    						"space",
                    						lv_space_0_0,
                    						"org.xtext.example.mydsl.MyDsl.Space");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:559:3: ( (lv_guielement_1_0= ruleGuiElement ) )
                    {
                    // InternalMyDsl.g:559:3: ( (lv_guielement_1_0= ruleGuiElement ) )
                    // InternalMyDsl.g:560:4: (lv_guielement_1_0= ruleGuiElement )
                    {
                    // InternalMyDsl.g:560:4: (lv_guielement_1_0= ruleGuiElement )
                    // InternalMyDsl.g:561:5: lv_guielement_1_0= ruleGuiElement
                    {

                    					newCompositeNode(grammarAccess.getLayoutVerticalEntryAccess().getGuielementGuiElementParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_guielement_1_0=ruleGuiElement();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLayoutVerticalEntryRule());
                    					}
                    					set(
                    						current,
                    						"guielement",
                    						lv_guielement_1_0,
                    						"org.xtext.example.mydsl.MyDsl.GuiElement");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


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
    // $ANTLR end "ruleLayoutVerticalEntry"


    // $ANTLR start "entryRuleLayoutPosition"
    // InternalMyDsl.g:582:1: entryRuleLayoutPosition returns [EObject current=null] : iv_ruleLayoutPosition= ruleLayoutPosition EOF ;
    public final EObject entryRuleLayoutPosition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayoutPosition = null;


        try {
            // InternalMyDsl.g:582:55: (iv_ruleLayoutPosition= ruleLayoutPosition EOF )
            // InternalMyDsl.g:583:2: iv_ruleLayoutPosition= ruleLayoutPosition EOF
            {
             newCompositeNode(grammarAccess.getLayoutPositionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLayoutPosition=ruleLayoutPosition();

            state._fsp--;

             current =iv_ruleLayoutPosition; 
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
    // $ANTLR end "entryRuleLayoutPosition"


    // $ANTLR start "ruleLayoutPosition"
    // InternalMyDsl.g:589:1: ruleLayoutPosition returns [EObject current=null] : (otherlv_0= 'positional' otherlv_1= '{' ( (lv_entries_2_0= ruleLayoutPositionEntry ) )* otherlv_3= '}' ) ;
    public final EObject ruleLayoutPosition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_entries_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:595:2: ( (otherlv_0= 'positional' otherlv_1= '{' ( (lv_entries_2_0= ruleLayoutPositionEntry ) )* otherlv_3= '}' ) )
            // InternalMyDsl.g:596:2: (otherlv_0= 'positional' otherlv_1= '{' ( (lv_entries_2_0= ruleLayoutPositionEntry ) )* otherlv_3= '}' )
            {
            // InternalMyDsl.g:596:2: (otherlv_0= 'positional' otherlv_1= '{' ( (lv_entries_2_0= ruleLayoutPositionEntry ) )* otherlv_3= '}' )
            // InternalMyDsl.g:597:3: otherlv_0= 'positional' otherlv_1= '{' ( (lv_entries_2_0= ruleLayoutPositionEntry ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getLayoutPositionAccess().getPositionalKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getLayoutPositionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMyDsl.g:605:3: ( (lv_entries_2_0= ruleLayoutPositionEntry ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==19) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:606:4: (lv_entries_2_0= ruleLayoutPositionEntry )
            	    {
            	    // InternalMyDsl.g:606:4: (lv_entries_2_0= ruleLayoutPositionEntry )
            	    // InternalMyDsl.g:607:5: lv_entries_2_0= ruleLayoutPositionEntry
            	    {

            	    					newCompositeNode(grammarAccess.getLayoutPositionAccess().getEntriesLayoutPositionEntryParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_entries_2_0=ruleLayoutPositionEntry();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLayoutPositionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"entries",
            	    						lv_entries_2_0,
            	    						"org.xtext.example.mydsl.MyDsl.LayoutPositionEntry");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_3=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getLayoutPositionAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleLayoutPosition"


    // $ANTLR start "entryRuleLayoutPositionEntry"
    // InternalMyDsl.g:632:1: entryRuleLayoutPositionEntry returns [EObject current=null] : iv_ruleLayoutPositionEntry= ruleLayoutPositionEntry EOF ;
    public final EObject entryRuleLayoutPositionEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayoutPositionEntry = null;


        try {
            // InternalMyDsl.g:632:60: (iv_ruleLayoutPositionEntry= ruleLayoutPositionEntry EOF )
            // InternalMyDsl.g:633:2: iv_ruleLayoutPositionEntry= ruleLayoutPositionEntry EOF
            {
             newCompositeNode(grammarAccess.getLayoutPositionEntryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLayoutPositionEntry=ruleLayoutPositionEntry();

            state._fsp--;

             current =iv_ruleLayoutPositionEntry; 
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
    // $ANTLR end "entryRuleLayoutPositionEntry"


    // $ANTLR start "ruleLayoutPositionEntry"
    // InternalMyDsl.g:639:1: ruleLayoutPositionEntry returns [EObject current=null] : (otherlv_0= '[' ( (lv_position_1_0= rulePositionValue ) ) otherlv_2= ']' ( (lv_guielement_3_0= ruleGuiElement ) ) ) ;
    public final EObject ruleLayoutPositionEntry() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_position_1_0 = null;

        EObject lv_guielement_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:645:2: ( (otherlv_0= '[' ( (lv_position_1_0= rulePositionValue ) ) otherlv_2= ']' ( (lv_guielement_3_0= ruleGuiElement ) ) ) )
            // InternalMyDsl.g:646:2: (otherlv_0= '[' ( (lv_position_1_0= rulePositionValue ) ) otherlv_2= ']' ( (lv_guielement_3_0= ruleGuiElement ) ) )
            {
            // InternalMyDsl.g:646:2: (otherlv_0= '[' ( (lv_position_1_0= rulePositionValue ) ) otherlv_2= ']' ( (lv_guielement_3_0= ruleGuiElement ) ) )
            // InternalMyDsl.g:647:3: otherlv_0= '[' ( (lv_position_1_0= rulePositionValue ) ) otherlv_2= ']' ( (lv_guielement_3_0= ruleGuiElement ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getLayoutPositionEntryAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalMyDsl.g:651:3: ( (lv_position_1_0= rulePositionValue ) )
            // InternalMyDsl.g:652:4: (lv_position_1_0= rulePositionValue )
            {
            // InternalMyDsl.g:652:4: (lv_position_1_0= rulePositionValue )
            // InternalMyDsl.g:653:5: lv_position_1_0= rulePositionValue
            {

            					newCompositeNode(grammarAccess.getLayoutPositionEntryAccess().getPositionPositionValueParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_13);
            lv_position_1_0=rulePositionValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLayoutPositionEntryRule());
            					}
            					set(
            						current,
            						"position",
            						lv_position_1_0,
            						"org.xtext.example.mydsl.MyDsl.PositionValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getLayoutPositionEntryAccess().getRightSquareBracketKeyword_2());
            		
            // InternalMyDsl.g:674:3: ( (lv_guielement_3_0= ruleGuiElement ) )
            // InternalMyDsl.g:675:4: (lv_guielement_3_0= ruleGuiElement )
            {
            // InternalMyDsl.g:675:4: (lv_guielement_3_0= ruleGuiElement )
            // InternalMyDsl.g:676:5: lv_guielement_3_0= ruleGuiElement
            {

            					newCompositeNode(grammarAccess.getLayoutPositionEntryAccess().getGuielementGuiElementParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_guielement_3_0=ruleGuiElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLayoutPositionEntryRule());
            					}
            					set(
            						current,
            						"guielement",
            						lv_guielement_3_0,
            						"org.xtext.example.mydsl.MyDsl.GuiElement");
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
    // $ANTLR end "ruleLayoutPositionEntry"


    // $ANTLR start "entryRuleSpace"
    // InternalMyDsl.g:697:1: entryRuleSpace returns [EObject current=null] : iv_ruleSpace= ruleSpace EOF ;
    public final EObject entryRuleSpace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpace = null;


        try {
            // InternalMyDsl.g:697:46: (iv_ruleSpace= ruleSpace EOF )
            // InternalMyDsl.g:698:2: iv_ruleSpace= ruleSpace EOF
            {
             newCompositeNode(grammarAccess.getSpaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSpace=ruleSpace();

            state._fsp--;

             current =iv_ruleSpace; 
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
    // $ANTLR end "entryRuleSpace"


    // $ANTLR start "ruleSpace"
    // InternalMyDsl.g:704:1: ruleSpace returns [EObject current=null] : (otherlv_0= 'space' ( (lv_space_1_0= RULE_INT ) ) ) ;
    public final EObject ruleSpace() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_space_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:710:2: ( (otherlv_0= 'space' ( (lv_space_1_0= RULE_INT ) ) ) )
            // InternalMyDsl.g:711:2: (otherlv_0= 'space' ( (lv_space_1_0= RULE_INT ) ) )
            {
            // InternalMyDsl.g:711:2: (otherlv_0= 'space' ( (lv_space_1_0= RULE_INT ) ) )
            // InternalMyDsl.g:712:3: otherlv_0= 'space' ( (lv_space_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getSpaceAccess().getSpaceKeyword_0());
            		
            // InternalMyDsl.g:716:3: ( (lv_space_1_0= RULE_INT ) )
            // InternalMyDsl.g:717:4: (lv_space_1_0= RULE_INT )
            {
            // InternalMyDsl.g:717:4: (lv_space_1_0= RULE_INT )
            // InternalMyDsl.g:718:5: lv_space_1_0= RULE_INT
            {
            lv_space_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_space_1_0, grammarAccess.getSpaceAccess().getSpaceINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSpaceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"space",
            						lv_space_1_0,
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
    // $ANTLR end "ruleSpace"


    // $ANTLR start "entryRulePositionValue"
    // InternalMyDsl.g:738:1: entryRulePositionValue returns [EObject current=null] : iv_rulePositionValue= rulePositionValue EOF ;
    public final EObject entryRulePositionValue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePositionValue = null;


        try {
            // InternalMyDsl.g:738:54: (iv_rulePositionValue= rulePositionValue EOF )
            // InternalMyDsl.g:739:2: iv_rulePositionValue= rulePositionValue EOF
            {
             newCompositeNode(grammarAccess.getPositionValueRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePositionValue=rulePositionValue();

            state._fsp--;

             current =iv_rulePositionValue; 
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
    // $ANTLR end "entryRulePositionValue"


    // $ANTLR start "rulePositionValue"
    // InternalMyDsl.g:745:1: rulePositionValue returns [EObject current=null] : ( ( (lv_posX_0_0= RULE_INT ) ) otherlv_1= ',' ( (lv_posY_2_0= RULE_INT ) ) ) ;
    public final EObject rulePositionValue() throws RecognitionException {
        EObject current = null;

        Token lv_posX_0_0=null;
        Token otherlv_1=null;
        Token lv_posY_2_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:751:2: ( ( ( (lv_posX_0_0= RULE_INT ) ) otherlv_1= ',' ( (lv_posY_2_0= RULE_INT ) ) ) )
            // InternalMyDsl.g:752:2: ( ( (lv_posX_0_0= RULE_INT ) ) otherlv_1= ',' ( (lv_posY_2_0= RULE_INT ) ) )
            {
            // InternalMyDsl.g:752:2: ( ( (lv_posX_0_0= RULE_INT ) ) otherlv_1= ',' ( (lv_posY_2_0= RULE_INT ) ) )
            // InternalMyDsl.g:753:3: ( (lv_posX_0_0= RULE_INT ) ) otherlv_1= ',' ( (lv_posY_2_0= RULE_INT ) )
            {
            // InternalMyDsl.g:753:3: ( (lv_posX_0_0= RULE_INT ) )
            // InternalMyDsl.g:754:4: (lv_posX_0_0= RULE_INT )
            {
            // InternalMyDsl.g:754:4: (lv_posX_0_0= RULE_INT )
            // InternalMyDsl.g:755:5: lv_posX_0_0= RULE_INT
            {
            lv_posX_0_0=(Token)match(input,RULE_INT,FOLLOW_15); 

            					newLeafNode(lv_posX_0_0, grammarAccess.getPositionValueAccess().getPosXINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPositionValueRule());
            					}
            					setWithLastConsumed(
            						current,
            						"posX",
            						lv_posX_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getPositionValueAccess().getCommaKeyword_1());
            		
            // InternalMyDsl.g:775:3: ( (lv_posY_2_0= RULE_INT ) )
            // InternalMyDsl.g:776:4: (lv_posY_2_0= RULE_INT )
            {
            // InternalMyDsl.g:776:4: (lv_posY_2_0= RULE_INT )
            // InternalMyDsl.g:777:5: lv_posY_2_0= RULE_INT
            {
            lv_posY_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_posY_2_0, grammarAccess.getPositionValueAccess().getPosYINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPositionValueRule());
            					}
            					setWithLastConsumed(
            						current,
            						"posY",
            						lv_posY_2_0,
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
    // $ANTLR end "rulePositionValue"


    // $ANTLR start "entryRuleSize"
    // InternalMyDsl.g:797:1: entryRuleSize returns [EObject current=null] : iv_ruleSize= ruleSize EOF ;
    public final EObject entryRuleSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSize = null;


        try {
            // InternalMyDsl.g:797:45: (iv_ruleSize= ruleSize EOF )
            // InternalMyDsl.g:798:2: iv_ruleSize= ruleSize EOF
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
    // InternalMyDsl.g:804:1: ruleSize returns [EObject current=null] : ( ( (lv_width_0_0= RULE_INT ) ) otherlv_1= ',' ( (lv_height_2_0= RULE_INT ) ) ) ;
    public final EObject ruleSize() throws RecognitionException {
        EObject current = null;

        Token lv_width_0_0=null;
        Token otherlv_1=null;
        Token lv_height_2_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:810:2: ( ( ( (lv_width_0_0= RULE_INT ) ) otherlv_1= ',' ( (lv_height_2_0= RULE_INT ) ) ) )
            // InternalMyDsl.g:811:2: ( ( (lv_width_0_0= RULE_INT ) ) otherlv_1= ',' ( (lv_height_2_0= RULE_INT ) ) )
            {
            // InternalMyDsl.g:811:2: ( ( (lv_width_0_0= RULE_INT ) ) otherlv_1= ',' ( (lv_height_2_0= RULE_INT ) ) )
            // InternalMyDsl.g:812:3: ( (lv_width_0_0= RULE_INT ) ) otherlv_1= ',' ( (lv_height_2_0= RULE_INT ) )
            {
            // InternalMyDsl.g:812:3: ( (lv_width_0_0= RULE_INT ) )
            // InternalMyDsl.g:813:4: (lv_width_0_0= RULE_INT )
            {
            // InternalMyDsl.g:813:4: (lv_width_0_0= RULE_INT )
            // InternalMyDsl.g:814:5: lv_width_0_0= RULE_INT
            {
            lv_width_0_0=(Token)match(input,RULE_INT,FOLLOW_15); 

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

            otherlv_1=(Token)match(input,22,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getSizeAccess().getCommaKeyword_1());
            		
            // InternalMyDsl.g:834:3: ( (lv_height_2_0= RULE_INT ) )
            // InternalMyDsl.g:835:4: (lv_height_2_0= RULE_INT )
            {
            // InternalMyDsl.g:835:4: (lv_height_2_0= RULE_INT )
            // InternalMyDsl.g:836:5: lv_height_2_0= RULE_INT
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


    // $ANTLR start "entryRuleGuiElement"
    // InternalMyDsl.g:856:1: entryRuleGuiElement returns [EObject current=null] : iv_ruleGuiElement= ruleGuiElement EOF ;
    public final EObject entryRuleGuiElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGuiElement = null;


        try {
            // InternalMyDsl.g:856:51: (iv_ruleGuiElement= ruleGuiElement EOF )
            // InternalMyDsl.g:857:2: iv_ruleGuiElement= ruleGuiElement EOF
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
    // InternalMyDsl.g:863:1: ruleGuiElement returns [EObject current=null] : (this_ContainerReference_0= ruleContainerReference | this_Layout_1= ruleLayout | this_Textfield_2= ruleTextfield | this_Label_3= ruleLabel | this_Button_4= ruleButton | this_Checkbox_5= ruleCheckbox | this_Radiobutton_6= ruleRadiobutton ) ;
    public final EObject ruleGuiElement() throws RecognitionException {
        EObject current = null;

        EObject this_ContainerReference_0 = null;

        EObject this_Layout_1 = null;

        EObject this_Textfield_2 = null;

        EObject this_Label_3 = null;

        EObject this_Button_4 = null;

        EObject this_Checkbox_5 = null;

        EObject this_Radiobutton_6 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:869:2: ( (this_ContainerReference_0= ruleContainerReference | this_Layout_1= ruleLayout | this_Textfield_2= ruleTextfield | this_Label_3= ruleLabel | this_Button_4= ruleButton | this_Checkbox_5= ruleCheckbox | this_Radiobutton_6= ruleRadiobutton ) )
            // InternalMyDsl.g:870:2: (this_ContainerReference_0= ruleContainerReference | this_Layout_1= ruleLayout | this_Textfield_2= ruleTextfield | this_Label_3= ruleLabel | this_Button_4= ruleButton | this_Checkbox_5= ruleCheckbox | this_Radiobutton_6= ruleRadiobutton )
            {
            // InternalMyDsl.g:870:2: (this_ContainerReference_0= ruleContainerReference | this_Layout_1= ruleLayout | this_Textfield_2= ruleTextfield | this_Label_3= ruleLabel | this_Button_4= ruleButton | this_Checkbox_5= ruleCheckbox | this_Radiobutton_6= ruleRadiobutton )
            int alt12=7;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt12=1;
                }
                break;
            case 14:
            case 17:
            case 18:
                {
                alt12=2;
                }
                break;
            case 23:
                {
                alt12=3;
                }
                break;
            case 24:
                {
                alt12=4;
                }
                break;
            case 25:
                {
                alt12=5;
                }
                break;
            case 26:
                {
                alt12=6;
                }
                break;
            case 27:
                {
                alt12=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:871:3: this_ContainerReference_0= ruleContainerReference
                    {

                    			newCompositeNode(grammarAccess.getGuiElementAccess().getContainerReferenceParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ContainerReference_0=ruleContainerReference();

                    state._fsp--;


                    			current = this_ContainerReference_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:880:3: this_Layout_1= ruleLayout
                    {

                    			newCompositeNode(grammarAccess.getGuiElementAccess().getLayoutParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Layout_1=ruleLayout();

                    state._fsp--;


                    			current = this_Layout_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:889:3: this_Textfield_2= ruleTextfield
                    {

                    			newCompositeNode(grammarAccess.getGuiElementAccess().getTextfieldParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Textfield_2=ruleTextfield();

                    state._fsp--;


                    			current = this_Textfield_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:898:3: this_Label_3= ruleLabel
                    {

                    			newCompositeNode(grammarAccess.getGuiElementAccess().getLabelParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Label_3=ruleLabel();

                    state._fsp--;


                    			current = this_Label_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:907:3: this_Button_4= ruleButton
                    {

                    			newCompositeNode(grammarAccess.getGuiElementAccess().getButtonParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Button_4=ruleButton();

                    state._fsp--;


                    			current = this_Button_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:916:3: this_Checkbox_5= ruleCheckbox
                    {

                    			newCompositeNode(grammarAccess.getGuiElementAccess().getCheckboxParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Checkbox_5=ruleCheckbox();

                    state._fsp--;


                    			current = this_Checkbox_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:925:3: this_Radiobutton_6= ruleRadiobutton
                    {

                    			newCompositeNode(grammarAccess.getGuiElementAccess().getRadiobuttonParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Radiobutton_6=ruleRadiobutton();

                    state._fsp--;


                    			current = this_Radiobutton_6;
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


    // $ANTLR start "entryRuleContainerReference"
    // InternalMyDsl.g:937:1: entryRuleContainerReference returns [EObject current=null] : iv_ruleContainerReference= ruleContainerReference EOF ;
    public final EObject entryRuleContainerReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainerReference = null;


        try {
            // InternalMyDsl.g:937:59: (iv_ruleContainerReference= ruleContainerReference EOF )
            // InternalMyDsl.g:938:2: iv_ruleContainerReference= ruleContainerReference EOF
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
    // InternalMyDsl.g:944:1: ruleContainerReference returns [EObject current=null] : ( ( (lv_referenceName_0_0= ruleNAME ) ) ( (lv_name_1_0= ruleNAME ) ) ) ;
    public final EObject ruleContainerReference() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_referenceName_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:950:2: ( ( ( (lv_referenceName_0_0= ruleNAME ) ) ( (lv_name_1_0= ruleNAME ) ) ) )
            // InternalMyDsl.g:951:2: ( ( (lv_referenceName_0_0= ruleNAME ) ) ( (lv_name_1_0= ruleNAME ) ) )
            {
            // InternalMyDsl.g:951:2: ( ( (lv_referenceName_0_0= ruleNAME ) ) ( (lv_name_1_0= ruleNAME ) ) )
            // InternalMyDsl.g:952:3: ( (lv_referenceName_0_0= ruleNAME ) ) ( (lv_name_1_0= ruleNAME ) )
            {
            // InternalMyDsl.g:952:3: ( (lv_referenceName_0_0= ruleNAME ) )
            // InternalMyDsl.g:953:4: (lv_referenceName_0_0= ruleNAME )
            {
            // InternalMyDsl.g:953:4: (lv_referenceName_0_0= ruleNAME )
            // InternalMyDsl.g:954:5: lv_referenceName_0_0= ruleNAME
            {

            					newCompositeNode(grammarAccess.getContainerReferenceAccess().getReferenceNameNAMEParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_referenceName_0_0=ruleNAME();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContainerReferenceRule());
            					}
            					set(
            						current,
            						"referenceName",
            						lv_referenceName_0_0,
            						"org.xtext.example.mydsl.MyDsl.NAME");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:971:3: ( (lv_name_1_0= ruleNAME ) )
            // InternalMyDsl.g:972:4: (lv_name_1_0= ruleNAME )
            {
            // InternalMyDsl.g:972:4: (lv_name_1_0= ruleNAME )
            // InternalMyDsl.g:973:5: lv_name_1_0= ruleNAME
            {

            					newCompositeNode(grammarAccess.getContainerReferenceAccess().getNameNAMEParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleNAME();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContainerReferenceRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyDsl.NAME");
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
    // $ANTLR end "ruleContainerReference"


    // $ANTLR start "entryRuleText"
    // InternalMyDsl.g:994:1: entryRuleText returns [EObject current=null] : iv_ruleText= ruleText EOF ;
    public final EObject entryRuleText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleText = null;


        try {
            // InternalMyDsl.g:994:45: (iv_ruleText= ruleText EOF )
            // InternalMyDsl.g:995:2: iv_ruleText= ruleText EOF
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
    // InternalMyDsl.g:1001:1: ruleText returns [EObject current=null] : ( (lv_text_0_0= RULE_STRING ) ) ;
    public final EObject ruleText() throws RecognitionException {
        EObject current = null;

        Token lv_text_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1007:2: ( ( (lv_text_0_0= RULE_STRING ) ) )
            // InternalMyDsl.g:1008:2: ( (lv_text_0_0= RULE_STRING ) )
            {
            // InternalMyDsl.g:1008:2: ( (lv_text_0_0= RULE_STRING ) )
            // InternalMyDsl.g:1009:3: (lv_text_0_0= RULE_STRING )
            {
            // InternalMyDsl.g:1009:3: (lv_text_0_0= RULE_STRING )
            // InternalMyDsl.g:1010:4: lv_text_0_0= RULE_STRING
            {
            lv_text_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_text_0_0, grammarAccess.getTextAccess().getTextSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getTextRule());
            				}
            				setWithLastConsumed(
            					current,
            					"text",
            					lv_text_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

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


    // $ANTLR start "entryRuleTextfield"
    // InternalMyDsl.g:1029:1: entryRuleTextfield returns [EObject current=null] : iv_ruleTextfield= ruleTextfield EOF ;
    public final EObject entryRuleTextfield() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextfield = null;


        try {
            // InternalMyDsl.g:1029:50: (iv_ruleTextfield= ruleTextfield EOF )
            // InternalMyDsl.g:1030:2: iv_ruleTextfield= ruleTextfield EOF
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
    // InternalMyDsl.g:1036:1: ruleTextfield returns [EObject current=null] : (otherlv_0= 'textfield' ( (lv_name_1_0= ruleNAME ) ) ( (lv_size_2_0= ruleSize ) )? ( (lv_text_3_0= ruleText ) ) ) ;
    public final EObject ruleTextfield() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_size_2_0 = null;

        EObject lv_text_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1042:2: ( (otherlv_0= 'textfield' ( (lv_name_1_0= ruleNAME ) ) ( (lv_size_2_0= ruleSize ) )? ( (lv_text_3_0= ruleText ) ) ) )
            // InternalMyDsl.g:1043:2: (otherlv_0= 'textfield' ( (lv_name_1_0= ruleNAME ) ) ( (lv_size_2_0= ruleSize ) )? ( (lv_text_3_0= ruleText ) ) )
            {
            // InternalMyDsl.g:1043:2: (otherlv_0= 'textfield' ( (lv_name_1_0= ruleNAME ) ) ( (lv_size_2_0= ruleSize ) )? ( (lv_text_3_0= ruleText ) ) )
            // InternalMyDsl.g:1044:3: otherlv_0= 'textfield' ( (lv_name_1_0= ruleNAME ) ) ( (lv_size_2_0= ruleSize ) )? ( (lv_text_3_0= ruleText ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTextfieldAccess().getTextfieldKeyword_0());
            		
            // InternalMyDsl.g:1048:3: ( (lv_name_1_0= ruleNAME ) )
            // InternalMyDsl.g:1049:4: (lv_name_1_0= ruleNAME )
            {
            // InternalMyDsl.g:1049:4: (lv_name_1_0= ruleNAME )
            // InternalMyDsl.g:1050:5: lv_name_1_0= ruleNAME
            {

            					newCompositeNode(grammarAccess.getTextfieldAccess().getNameNAMEParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_16);
            lv_name_1_0=ruleNAME();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTextfieldRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyDsl.NAME");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1067:3: ( (lv_size_2_0= ruleSize ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_INT) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:1068:4: (lv_size_2_0= ruleSize )
                    {
                    // InternalMyDsl.g:1068:4: (lv_size_2_0= ruleSize )
                    // InternalMyDsl.g:1069:5: lv_size_2_0= ruleSize
                    {

                    					newCompositeNode(grammarAccess.getTextfieldAccess().getSizeSizeParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_16);
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

            // InternalMyDsl.g:1086:3: ( (lv_text_3_0= ruleText ) )
            // InternalMyDsl.g:1087:4: (lv_text_3_0= ruleText )
            {
            // InternalMyDsl.g:1087:4: (lv_text_3_0= ruleText )
            // InternalMyDsl.g:1088:5: lv_text_3_0= ruleText
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
    // InternalMyDsl.g:1109:1: entryRuleLabel returns [EObject current=null] : iv_ruleLabel= ruleLabel EOF ;
    public final EObject entryRuleLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabel = null;


        try {
            // InternalMyDsl.g:1109:46: (iv_ruleLabel= ruleLabel EOF )
            // InternalMyDsl.g:1110:2: iv_ruleLabel= ruleLabel EOF
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
    // InternalMyDsl.g:1116:1: ruleLabel returns [EObject current=null] : (otherlv_0= 'label' ( (lv_name_1_0= ruleNAME ) ) ( (lv_size_2_0= ruleSize ) )? ( (lv_text_3_0= ruleText ) ) ) ;
    public final EObject ruleLabel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_size_2_0 = null;

        EObject lv_text_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1122:2: ( (otherlv_0= 'label' ( (lv_name_1_0= ruleNAME ) ) ( (lv_size_2_0= ruleSize ) )? ( (lv_text_3_0= ruleText ) ) ) )
            // InternalMyDsl.g:1123:2: (otherlv_0= 'label' ( (lv_name_1_0= ruleNAME ) ) ( (lv_size_2_0= ruleSize ) )? ( (lv_text_3_0= ruleText ) ) )
            {
            // InternalMyDsl.g:1123:2: (otherlv_0= 'label' ( (lv_name_1_0= ruleNAME ) ) ( (lv_size_2_0= ruleSize ) )? ( (lv_text_3_0= ruleText ) ) )
            // InternalMyDsl.g:1124:3: otherlv_0= 'label' ( (lv_name_1_0= ruleNAME ) ) ( (lv_size_2_0= ruleSize ) )? ( (lv_text_3_0= ruleText ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLabelAccess().getLabelKeyword_0());
            		
            // InternalMyDsl.g:1128:3: ( (lv_name_1_0= ruleNAME ) )
            // InternalMyDsl.g:1129:4: (lv_name_1_0= ruleNAME )
            {
            // InternalMyDsl.g:1129:4: (lv_name_1_0= ruleNAME )
            // InternalMyDsl.g:1130:5: lv_name_1_0= ruleNAME
            {

            					newCompositeNode(grammarAccess.getLabelAccess().getNameNAMEParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_16);
            lv_name_1_0=ruleNAME();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLabelRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyDsl.NAME");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1147:3: ( (lv_size_2_0= ruleSize ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_INT) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:1148:4: (lv_size_2_0= ruleSize )
                    {
                    // InternalMyDsl.g:1148:4: (lv_size_2_0= ruleSize )
                    // InternalMyDsl.g:1149:5: lv_size_2_0= ruleSize
                    {

                    					newCompositeNode(grammarAccess.getLabelAccess().getSizeSizeParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_16);
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

            // InternalMyDsl.g:1166:3: ( (lv_text_3_0= ruleText ) )
            // InternalMyDsl.g:1167:4: (lv_text_3_0= ruleText )
            {
            // InternalMyDsl.g:1167:4: (lv_text_3_0= ruleText )
            // InternalMyDsl.g:1168:5: lv_text_3_0= ruleText
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
    // InternalMyDsl.g:1189:1: entryRuleButton returns [EObject current=null] : iv_ruleButton= ruleButton EOF ;
    public final EObject entryRuleButton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleButton = null;


        try {
            // InternalMyDsl.g:1189:47: (iv_ruleButton= ruleButton EOF )
            // InternalMyDsl.g:1190:2: iv_ruleButton= ruleButton EOF
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
    // InternalMyDsl.g:1196:1: ruleButton returns [EObject current=null] : (otherlv_0= 'button' ( (lv_name_1_0= ruleNAME ) ) ( (lv_size_2_0= ruleSize ) )? ( (lv_text_3_0= ruleText ) ) ) ;
    public final EObject ruleButton() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_size_2_0 = null;

        EObject lv_text_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1202:2: ( (otherlv_0= 'button' ( (lv_name_1_0= ruleNAME ) ) ( (lv_size_2_0= ruleSize ) )? ( (lv_text_3_0= ruleText ) ) ) )
            // InternalMyDsl.g:1203:2: (otherlv_0= 'button' ( (lv_name_1_0= ruleNAME ) ) ( (lv_size_2_0= ruleSize ) )? ( (lv_text_3_0= ruleText ) ) )
            {
            // InternalMyDsl.g:1203:2: (otherlv_0= 'button' ( (lv_name_1_0= ruleNAME ) ) ( (lv_size_2_0= ruleSize ) )? ( (lv_text_3_0= ruleText ) ) )
            // InternalMyDsl.g:1204:3: otherlv_0= 'button' ( (lv_name_1_0= ruleNAME ) ) ( (lv_size_2_0= ruleSize ) )? ( (lv_text_3_0= ruleText ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getButtonAccess().getButtonKeyword_0());
            		
            // InternalMyDsl.g:1208:3: ( (lv_name_1_0= ruleNAME ) )
            // InternalMyDsl.g:1209:4: (lv_name_1_0= ruleNAME )
            {
            // InternalMyDsl.g:1209:4: (lv_name_1_0= ruleNAME )
            // InternalMyDsl.g:1210:5: lv_name_1_0= ruleNAME
            {

            					newCompositeNode(grammarAccess.getButtonAccess().getNameNAMEParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_16);
            lv_name_1_0=ruleNAME();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getButtonRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyDsl.NAME");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1227:3: ( (lv_size_2_0= ruleSize ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_INT) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:1228:4: (lv_size_2_0= ruleSize )
                    {
                    // InternalMyDsl.g:1228:4: (lv_size_2_0= ruleSize )
                    // InternalMyDsl.g:1229:5: lv_size_2_0= ruleSize
                    {

                    					newCompositeNode(grammarAccess.getButtonAccess().getSizeSizeParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_16);
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

            // InternalMyDsl.g:1246:3: ( (lv_text_3_0= ruleText ) )
            // InternalMyDsl.g:1247:4: (lv_text_3_0= ruleText )
            {
            // InternalMyDsl.g:1247:4: (lv_text_3_0= ruleText )
            // InternalMyDsl.g:1248:5: lv_text_3_0= ruleText
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
    // InternalMyDsl.g:1269:1: entryRuleCheckbox returns [EObject current=null] : iv_ruleCheckbox= ruleCheckbox EOF ;
    public final EObject entryRuleCheckbox() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheckbox = null;


        try {
            // InternalMyDsl.g:1269:49: (iv_ruleCheckbox= ruleCheckbox EOF )
            // InternalMyDsl.g:1270:2: iv_ruleCheckbox= ruleCheckbox EOF
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
    // InternalMyDsl.g:1276:1: ruleCheckbox returns [EObject current=null] : (otherlv_0= 'checkbox' ( (lv_name_1_0= ruleNAME ) ) ( (lv_size_2_0= ruleSize ) )? ( (lv_checked_3_0= ruleCHECKED ) ) ( (lv_text_4_0= ruleText ) ) ) ;
    public final EObject ruleCheckbox() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_size_2_0 = null;

        AntlrDatatypeRuleToken lv_checked_3_0 = null;

        EObject lv_text_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1282:2: ( (otherlv_0= 'checkbox' ( (lv_name_1_0= ruleNAME ) ) ( (lv_size_2_0= ruleSize ) )? ( (lv_checked_3_0= ruleCHECKED ) ) ( (lv_text_4_0= ruleText ) ) ) )
            // InternalMyDsl.g:1283:2: (otherlv_0= 'checkbox' ( (lv_name_1_0= ruleNAME ) ) ( (lv_size_2_0= ruleSize ) )? ( (lv_checked_3_0= ruleCHECKED ) ) ( (lv_text_4_0= ruleText ) ) )
            {
            // InternalMyDsl.g:1283:2: (otherlv_0= 'checkbox' ( (lv_name_1_0= ruleNAME ) ) ( (lv_size_2_0= ruleSize ) )? ( (lv_checked_3_0= ruleCHECKED ) ) ( (lv_text_4_0= ruleText ) ) )
            // InternalMyDsl.g:1284:3: otherlv_0= 'checkbox' ( (lv_name_1_0= ruleNAME ) ) ( (lv_size_2_0= ruleSize ) )? ( (lv_checked_3_0= ruleCHECKED ) ) ( (lv_text_4_0= ruleText ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCheckboxAccess().getCheckboxKeyword_0());
            		
            // InternalMyDsl.g:1288:3: ( (lv_name_1_0= ruleNAME ) )
            // InternalMyDsl.g:1289:4: (lv_name_1_0= ruleNAME )
            {
            // InternalMyDsl.g:1289:4: (lv_name_1_0= ruleNAME )
            // InternalMyDsl.g:1290:5: lv_name_1_0= ruleNAME
            {

            					newCompositeNode(grammarAccess.getCheckboxAccess().getNameNAMEParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_17);
            lv_name_1_0=ruleNAME();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCheckboxRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyDsl.NAME");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1307:3: ( (lv_size_2_0= ruleSize ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_INT) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:1308:4: (lv_size_2_0= ruleSize )
                    {
                    // InternalMyDsl.g:1308:4: (lv_size_2_0= ruleSize )
                    // InternalMyDsl.g:1309:5: lv_size_2_0= ruleSize
                    {

                    					newCompositeNode(grammarAccess.getCheckboxAccess().getSizeSizeParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_17);
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

            // InternalMyDsl.g:1326:3: ( (lv_checked_3_0= ruleCHECKED ) )
            // InternalMyDsl.g:1327:4: (lv_checked_3_0= ruleCHECKED )
            {
            // InternalMyDsl.g:1327:4: (lv_checked_3_0= ruleCHECKED )
            // InternalMyDsl.g:1328:5: lv_checked_3_0= ruleCHECKED
            {

            					newCompositeNode(grammarAccess.getCheckboxAccess().getCheckedCHECKEDParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_16);
            lv_checked_3_0=ruleCHECKED();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCheckboxRule());
            					}
            					set(
            						current,
            						"checked",
            						lv_checked_3_0,
            						"org.xtext.example.mydsl.MyDsl.CHECKED");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1345:3: ( (lv_text_4_0= ruleText ) )
            // InternalMyDsl.g:1346:4: (lv_text_4_0= ruleText )
            {
            // InternalMyDsl.g:1346:4: (lv_text_4_0= ruleText )
            // InternalMyDsl.g:1347:5: lv_text_4_0= ruleText
            {

            					newCompositeNode(grammarAccess.getCheckboxAccess().getTextTextParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_text_4_0=ruleText();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCheckboxRule());
            					}
            					set(
            						current,
            						"text",
            						lv_text_4_0,
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
    // $ANTLR end "ruleCheckbox"


    // $ANTLR start "entryRuleRadiobutton"
    // InternalMyDsl.g:1368:1: entryRuleRadiobutton returns [EObject current=null] : iv_ruleRadiobutton= ruleRadiobutton EOF ;
    public final EObject entryRuleRadiobutton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRadiobutton = null;


        try {
            // InternalMyDsl.g:1368:52: (iv_ruleRadiobutton= ruleRadiobutton EOF )
            // InternalMyDsl.g:1369:2: iv_ruleRadiobutton= ruleRadiobutton EOF
            {
             newCompositeNode(grammarAccess.getRadiobuttonRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRadiobutton=ruleRadiobutton();

            state._fsp--;

             current =iv_ruleRadiobutton; 
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
    // $ANTLR end "entryRuleRadiobutton"


    // $ANTLR start "ruleRadiobutton"
    // InternalMyDsl.g:1375:1: ruleRadiobutton returns [EObject current=null] : (otherlv_0= 'radio' ( (lv_group_1_0= ruleNAME ) ) ( (lv_name_2_0= ruleNAME ) ) ( (lv_size_3_0= ruleSize ) )? ( (lv_checked_4_0= ruleCHECKED_YES ) )? ( (lv_text_5_0= ruleText ) ) ) ;
    public final EObject ruleRadiobutton() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_group_1_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_size_3_0 = null;

        AntlrDatatypeRuleToken lv_checked_4_0 = null;

        EObject lv_text_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1381:2: ( (otherlv_0= 'radio' ( (lv_group_1_0= ruleNAME ) ) ( (lv_name_2_0= ruleNAME ) ) ( (lv_size_3_0= ruleSize ) )? ( (lv_checked_4_0= ruleCHECKED_YES ) )? ( (lv_text_5_0= ruleText ) ) ) )
            // InternalMyDsl.g:1382:2: (otherlv_0= 'radio' ( (lv_group_1_0= ruleNAME ) ) ( (lv_name_2_0= ruleNAME ) ) ( (lv_size_3_0= ruleSize ) )? ( (lv_checked_4_0= ruleCHECKED_YES ) )? ( (lv_text_5_0= ruleText ) ) )
            {
            // InternalMyDsl.g:1382:2: (otherlv_0= 'radio' ( (lv_group_1_0= ruleNAME ) ) ( (lv_name_2_0= ruleNAME ) ) ( (lv_size_3_0= ruleSize ) )? ( (lv_checked_4_0= ruleCHECKED_YES ) )? ( (lv_text_5_0= ruleText ) ) )
            // InternalMyDsl.g:1383:3: otherlv_0= 'radio' ( (lv_group_1_0= ruleNAME ) ) ( (lv_name_2_0= ruleNAME ) ) ( (lv_size_3_0= ruleSize ) )? ( (lv_checked_4_0= ruleCHECKED_YES ) )? ( (lv_text_5_0= ruleText ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRadiobuttonAccess().getRadioKeyword_0());
            		
            // InternalMyDsl.g:1387:3: ( (lv_group_1_0= ruleNAME ) )
            // InternalMyDsl.g:1388:4: (lv_group_1_0= ruleNAME )
            {
            // InternalMyDsl.g:1388:4: (lv_group_1_0= ruleNAME )
            // InternalMyDsl.g:1389:5: lv_group_1_0= ruleNAME
            {

            					newCompositeNode(grammarAccess.getRadiobuttonAccess().getGroupNAMEParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_group_1_0=ruleNAME();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRadiobuttonRule());
            					}
            					set(
            						current,
            						"group",
            						lv_group_1_0,
            						"org.xtext.example.mydsl.MyDsl.NAME");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1406:3: ( (lv_name_2_0= ruleNAME ) )
            // InternalMyDsl.g:1407:4: (lv_name_2_0= ruleNAME )
            {
            // InternalMyDsl.g:1407:4: (lv_name_2_0= ruleNAME )
            // InternalMyDsl.g:1408:5: lv_name_2_0= ruleNAME
            {

            					newCompositeNode(grammarAccess.getRadiobuttonAccess().getNameNAMEParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_18);
            lv_name_2_0=ruleNAME();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRadiobuttonRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl.MyDsl.NAME");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1425:3: ( (lv_size_3_0= ruleSize ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_INT) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:1426:4: (lv_size_3_0= ruleSize )
                    {
                    // InternalMyDsl.g:1426:4: (lv_size_3_0= ruleSize )
                    // InternalMyDsl.g:1427:5: lv_size_3_0= ruleSize
                    {

                    					newCompositeNode(grammarAccess.getRadiobuttonAccess().getSizeSizeParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_18);
                    lv_size_3_0=ruleSize();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRadiobuttonRule());
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

            // InternalMyDsl.g:1444:3: ( (lv_checked_4_0= ruleCHECKED_YES ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==28) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMyDsl.g:1445:4: (lv_checked_4_0= ruleCHECKED_YES )
                    {
                    // InternalMyDsl.g:1445:4: (lv_checked_4_0= ruleCHECKED_YES )
                    // InternalMyDsl.g:1446:5: lv_checked_4_0= ruleCHECKED_YES
                    {

                    					newCompositeNode(grammarAccess.getRadiobuttonAccess().getCheckedCHECKED_YESParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_16);
                    lv_checked_4_0=ruleCHECKED_YES();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRadiobuttonRule());
                    					}
                    					set(
                    						current,
                    						"checked",
                    						lv_checked_4_0,
                    						"org.xtext.example.mydsl.MyDsl.CHECKED_YES");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1463:3: ( (lv_text_5_0= ruleText ) )
            // InternalMyDsl.g:1464:4: (lv_text_5_0= ruleText )
            {
            // InternalMyDsl.g:1464:4: (lv_text_5_0= ruleText )
            // InternalMyDsl.g:1465:5: lv_text_5_0= ruleText
            {

            					newCompositeNode(grammarAccess.getRadiobuttonAccess().getTextTextParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_text_5_0=ruleText();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRadiobuttonRule());
            					}
            					set(
            						current,
            						"text",
            						lv_text_5_0,
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
    // $ANTLR end "ruleRadiobutton"


    // $ANTLR start "entryRuleCHECKED"
    // InternalMyDsl.g:1486:1: entryRuleCHECKED returns [String current=null] : iv_ruleCHECKED= ruleCHECKED EOF ;
    public final String entryRuleCHECKED() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCHECKED = null;


        try {
            // InternalMyDsl.g:1486:47: (iv_ruleCHECKED= ruleCHECKED EOF )
            // InternalMyDsl.g:1487:2: iv_ruleCHECKED= ruleCHECKED EOF
            {
             newCompositeNode(grammarAccess.getCHECKEDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCHECKED=ruleCHECKED();

            state._fsp--;

             current =iv_ruleCHECKED.getText(); 
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
    // $ANTLR end "entryRuleCHECKED"


    // $ANTLR start "ruleCHECKED"
    // InternalMyDsl.g:1493:1: ruleCHECKED returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_CHECKED_YES_0= ruleCHECKED_YES | this_CHECKED_NO_1= ruleCHECKED_NO ) ;
    public final AntlrDatatypeRuleToken ruleCHECKED() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_CHECKED_YES_0 = null;

        AntlrDatatypeRuleToken this_CHECKED_NO_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1499:2: ( (this_CHECKED_YES_0= ruleCHECKED_YES | this_CHECKED_NO_1= ruleCHECKED_NO ) )
            // InternalMyDsl.g:1500:2: (this_CHECKED_YES_0= ruleCHECKED_YES | this_CHECKED_NO_1= ruleCHECKED_NO )
            {
            // InternalMyDsl.g:1500:2: (this_CHECKED_YES_0= ruleCHECKED_YES | this_CHECKED_NO_1= ruleCHECKED_NO )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==28) ) {
                alt19=1;
            }
            else if ( (LA19_0==29) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalMyDsl.g:1501:3: this_CHECKED_YES_0= ruleCHECKED_YES
                    {

                    			newCompositeNode(grammarAccess.getCHECKEDAccess().getCHECKED_YESParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_CHECKED_YES_0=ruleCHECKED_YES();

                    state._fsp--;


                    			current.merge(this_CHECKED_YES_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1512:3: this_CHECKED_NO_1= ruleCHECKED_NO
                    {

                    			newCompositeNode(grammarAccess.getCHECKEDAccess().getCHECKED_NOParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_CHECKED_NO_1=ruleCHECKED_NO();

                    state._fsp--;


                    			current.merge(this_CHECKED_NO_1);
                    		

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
    // $ANTLR end "ruleCHECKED"


    // $ANTLR start "entryRuleCHECKED_YES"
    // InternalMyDsl.g:1526:1: entryRuleCHECKED_YES returns [String current=null] : iv_ruleCHECKED_YES= ruleCHECKED_YES EOF ;
    public final String entryRuleCHECKED_YES() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCHECKED_YES = null;


        try {
            // InternalMyDsl.g:1526:51: (iv_ruleCHECKED_YES= ruleCHECKED_YES EOF )
            // InternalMyDsl.g:1527:2: iv_ruleCHECKED_YES= ruleCHECKED_YES EOF
            {
             newCompositeNode(grammarAccess.getCHECKED_YESRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCHECKED_YES=ruleCHECKED_YES();

            state._fsp--;

             current =iv_ruleCHECKED_YES.getText(); 
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
    // $ANTLR end "entryRuleCHECKED_YES"


    // $ANTLR start "ruleCHECKED_YES"
    // InternalMyDsl.g:1533:1: ruleCHECKED_YES returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'X' ;
    public final AntlrDatatypeRuleToken ruleCHECKED_YES() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1539:2: (kw= 'X' )
            // InternalMyDsl.g:1540:2: kw= 'X'
            {
            kw=(Token)match(input,28,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getCHECKED_YESAccess().getXKeyword());
            	

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
    // $ANTLR end "ruleCHECKED_YES"


    // $ANTLR start "entryRuleCHECKED_NO"
    // InternalMyDsl.g:1548:1: entryRuleCHECKED_NO returns [String current=null] : iv_ruleCHECKED_NO= ruleCHECKED_NO EOF ;
    public final String entryRuleCHECKED_NO() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCHECKED_NO = null;


        try {
            // InternalMyDsl.g:1548:50: (iv_ruleCHECKED_NO= ruleCHECKED_NO EOF )
            // InternalMyDsl.g:1549:2: iv_ruleCHECKED_NO= ruleCHECKED_NO EOF
            {
             newCompositeNode(grammarAccess.getCHECKED_NORule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCHECKED_NO=ruleCHECKED_NO();

            state._fsp--;

             current =iv_ruleCHECKED_NO.getText(); 
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
    // $ANTLR end "entryRuleCHECKED_NO"


    // $ANTLR start "ruleCHECKED_NO"
    // InternalMyDsl.g:1555:1: ruleCHECKED_NO returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'O' ;
    public final AntlrDatatypeRuleToken ruleCHECKED_NO() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1561:2: (kw= 'O' )
            // InternalMyDsl.g:1562:2: kw= 'O'
            {
            kw=(Token)match(input,29,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getCHECKED_NOAccess().getOKeyword());
            	

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
    // $ANTLR end "ruleCHECKED_NO"


    // $ANTLR start "entryRuleNAME"
    // InternalMyDsl.g:1570:1: entryRuleNAME returns [String current=null] : iv_ruleNAME= ruleNAME EOF ;
    public final String entryRuleNAME() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNAME = null;


        try {
            // InternalMyDsl.g:1570:44: (iv_ruleNAME= ruleNAME EOF )
            // InternalMyDsl.g:1571:2: iv_ruleNAME= ruleNAME EOF
            {
             newCompositeNode(grammarAccess.getNAMERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNAME=ruleNAME();

            state._fsp--;

             current =iv_ruleNAME.getText(); 
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
    // $ANTLR end "entryRuleNAME"


    // $ANTLR start "ruleNAME"
    // InternalMyDsl.g:1577:1: ruleNAME returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleNAME() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1583:2: (this_ID_0= RULE_ID )
            // InternalMyDsl.g:1584:2: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            		current.merge(this_ID_0);
            	

            		newLeafNode(this_ID_0, grammarAccess.getNAMEAccess().getIDTerminalRuleCall());
            	

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
    // $ANTLR end "ruleNAME"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000064012L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000064002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000064010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000064000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000000FA74040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000000FA64040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000030000010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010000030L});

}